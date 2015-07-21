package org.nails.controllers;

import org.nails.Constants;
import org.nails.hibernate.entity.Album;
import org.nails.hibernate.entity.Picture;
import org.nails.service.AlbumService;
import org.nails.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    ServletContext servletContext;

    @Autowired
    private AlbumService albumService;

    @Autowired
    private PhotoService photoService;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "mainIndex";
    }

    @RequestMapping(value = "/{albumId}/addPhoto")
    public ModelAndView addPhoto(@PathVariable int albumId,
                                 @RequestParam(required = false) String error) {
        ModelAndView model = new ModelAndView("addPhoto");
        model.addObject("albumId", albumId);
        model.addObject("error", error);
        return model;
    }

    @RequestMapping(value = "/upload/{albumId}", method = RequestMethod.POST)
    public String handleFileUpload(@PathVariable int albumId,
                                   @RequestParam("photoName") String photoName,
                                   @RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            if (file.getOriginalFilename().endsWith(Constants.JPG) ||
                    file.getOriginalFilename().endsWith(Constants.GIF) ||
                    file.getOriginalFilename().endsWith(Constants.PNG)) {
                try {
                    byte[] bytes = file.getBytes();
                    return photoService.uploadPhoto(albumId, bytes, photoName);
                } catch (Exception e) {
                    return "You failed to upload " + photoName + " => " + e.getMessage();
                }
            } else {
                return "Format of uploading photo is not correctly.";
            }
        } else {
            return "You failed to upload " + photoName + " because the file was empty.";
        }
    }

    @RequestMapping(value = "/deletePhoto/{photoId}/{albumId}")
    public String deletePhoto(@PathVariable("photoId") int photoId,
                              @PathVariable("albumId") int albumId) {
        photoService.deletePhotoFromFolder(photoId);
        photoService.deletePhoto(photoId);
        return "redirect:/album/{albumId}";
    }

    @RequestMapping(value = "/updatePhoto/{photoId}")
    public ModelAndView updatePhoto(@PathVariable("photoId") int photoId) {
        ModelAndView model = new ModelAndView("updatePhoto");
        Picture picture = photoService.readPhotoById(photoId);
        List<Album> albums = albumService.readAlbums();
        model.addObject("albums", albums);
        model.addObject("picture", picture);
        return model;
    }

    @RequestMapping(value = "/saveUpdatePhoto")
    @ResponseBody
    public String saveUpdatePhoto(@RequestParam(value = "photoName") String photoName,
                                  @RequestParam(value = "photoId") int photoId,
                                  @RequestParam(value = "albumId") int albumId) {
        photoService.updatePhoto(photoName, photoId, albumId);
        return "/album/" + albumId;
    }

    @RequestMapping(value = "/showRenameForm")
    public ModelAndView showRenameForm() {
        ModelAndView model = new ModelAndView("renameWindow");
        return model;
    }

}
