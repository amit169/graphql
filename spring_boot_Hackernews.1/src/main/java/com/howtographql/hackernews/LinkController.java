package com.howtographql.hackernews;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.howtographql.hackernews.Link;
import com.howtographql.hackernews.LinkRepository;

@RestController
@RequestMapping("/link")
public class LinkController {

//@Autowired
private LinkRepository linkRepository;

/**
This method is used to post a single Sizzle

@RequestMapping(method = RequestMethod.POST)
public Map<String, Object> createLink(@RequestBody Map<String, Object> linkMap){

    //Using the Sizzle setAll constructor
    Link link = new Link(linkMap.get("url").toString(),

			         linkMap.get("description").toString(),
				        linkMap.get("userId").toString()
                );
    //using the Repo interface to comit the sizzle
		linkRepository.save(link);

     // Create the Responce Object
        Map<String, Object> response = new LinkedHashMap<String, Object>();

		    response.put("message", "Link created successfully");

		    response.put("link", link);

		return response;
	}
*/

/**
This method is used to get a single sizzle based on the ID

	@RequestMapping(method = RequestMethod.GET, value="/{linkId}")

	  public Link getLinkDetails(@PathVariable("linkId") String linkId){
      //use the Sizzle Repo interface to get Single Sizzle
	    return linkRepository.findOne(linkId);

	  }
*/
/**
this method is used to update a single Sizzle

@RequestMapping(method = RequestMethod.PUT, value="/{linkId}")

public Map<String, Object> editLink(@PathVariable("linkId") String linkId,

    @RequestBody Map<String, Object> linkMap){

      Link link = new Link(linkMap.get("url").toString(),

  			         linkMap.get("description").toString(),
  				        linkMap.get("userId").toString()
                  );
                  //link.setId(linkId);

  Map<String, Object> response = new LinkedHashMap<String, Object>();

  response.put("message", "Link Updated successfully");

  response.put("link", linkRepository.save(link));
  return response;

}
*/

/**
This Method deletes a sizzle

@RequestMapping(method = RequestMethod.DELETE, value="/{linkId}")

public Map<String, String> deleteLink(@PathVariable("linkId") String linkId){
  linkRepository.delete(linkId);
  Map<String, String> response = new HashMap<String, String>();
  response.put("message", "Link deleted successfully");
  return response;
}
*/

/**
This Sizzle gets a list of all Sizzles
*/
@RequestMapping(method = RequestMethod.GET)
public Map<String, Object> getAllLinks(){
  List<Link> link = linkRepository.getAllLinks();
  Map<String, Object> response = new LinkedHashMap<String, Object>();
  response.put("totalLinks", link.size());
  response.put("links", link);
  return response;
}


}
