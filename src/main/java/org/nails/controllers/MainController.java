package org.nails.controllers;

import org.nails.hibernate.entity.Album;
import org.nails.hibernate.entity.Picture;
import org.nails.service.AlbumService;
import org.nails.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Aleksander on 08.06.2015.
 */
@Controller
public class MainController {
    @Autowired
    private AlbumService albumService;

    @Autowired
    private PhotoService photoService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value ="/design", method = RequestMethod.GET)
    public ModelAndView showAlbums(){
        ModelAndView mav = new ModelAndView("design");
        List <Album> albums = albumService.readAlbums();
        mav.addObject("albums",albums);
        return mav;
    }
    @RequestMapping("/album/{albumId}")
    public ModelAndView showAlbum(@PathVariable("albumId") int albumId){
        List<Picture> allPictures = photoService.readAllPictures(albumId);
        ModelAndView mav=new ModelAndView("album");
        mav.addObject("pictures",allPictures);
        mav.addObject(albumId);
        return mav;
    }

}
