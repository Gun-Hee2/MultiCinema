package com.one.multicinemaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dao.FilmographyDao;
import com.one.multicinemaback.dto.ActorDto;
import com.one.multicinemaback.dto.MovieDto;
import com.one.multicinemaback.dto.ReviewDto;
import com.one.multicinemaback.service.ActorService;
import com.one.multicinemaback.service.FilmographyService;
import com.one.multicinemaback.service.MovieService;
import com.one.multicinemaback.service.ReviewService;

@RestController
public class MovieController {

	
	  @Autowired 
	  private MovieService service;
	  
	  @Autowired
	  private ActorService aservice;
	  
	  @Autowired
	  private ReviewService rservice;
	  
	  @Autowired
	  private FilmographyService fservice;
	  
      @RequestMapping(value = "/movielist", method = RequestMethod.GET) 
	  public List<MovieDto> list(){
		  System.out.println("MovieController list()");
		  
		  List<MovieDto> list = service.getmovielist();
		  
	  return list;
	  
	  }
      
      @RequestMapping(value = "/moviedetail", method = RequestMethod.GET)
  	  public MovieDto moviedetail(int seq) {
  		  System.out.println("MovieController Moviedetail()");
  		  
  		  return service.getMovie(seq);
  	  }
      
      @RequestMapping(value = "/getActor", method = RequestMethod.GET)
      public List<ActorDto> getActor(int seq) {
    	  System.out.println("MovieController getActor()");
    	  
    	  return aservice.getActor(seq);    	// seq actor  
      }
      
      @RequestMapping(value = "/actordetail", method = RequestMethod.GET)
      public ActorDto actordetail(int aid) {
    	  System.out.println("MovieController actordetail()");
    	  return aservice.getActorInfo(aid);
    		
      }
      
      @RequestMapping(value = "/actorMovie", method = RequestMethod.GET)
      public ActorDto getActorMovie(int aid) {
    	  System.out.println("MovieController getActorMovie()");
    	  
    	  return aservice.getActorMovie(aid);
      }
  	
  	  @RequestMapping(value = "/reviewlist", method = RequestMethod.GET) 
  	  public List<ReviewDto> reviewList(int seq) throws Exception{
  		  System.out.println("MovieController reviewList()");
  		  
  		  List<ReviewDto> list = rservice.reviewList(seq);
  		  
  	  return list;
  	  
  	  }
  	
   	  @RequestMapping(value = "/reviewinsert", method = RequestMethod.POST) 
  	  public String reviewInsert(ReviewDto dto) throws Exception{
  		  System.out.println("MovieController reviewInsert()");
  		  
  		  rservice.reviewInsert(dto);
  		  service.updateScore(dto.getSeq());
  		  return "success";
  	  }
  	 
   	  @RequestMapping(value = "/reviewupdate", method = RequestMethod.GET)
   	  public int reviewUpdate(int rnum, String content) throws Exception {
   		  System.out.println("MovieController reviewUpdate()");

  		  ReviewDto review = new ReviewDto();
  		  review.setRnum(rnum);
  		  review.setContent(content);
  		 
  		  return rservice.reviewUpdate(review);
  		 
  	 }
  	 
  	 @RequestMapping(value = "/reviewdelete", method = RequestMethod.GET)
  	 public int reviewDelete(int rnum) throws Exception {
  		  System.out.println("ReviewController reviewDelete()");
  		  
  		 return rservice.reviewDelete(rnum);
  	 }
  	 
  	 @RequestMapping(value = "/filmo", method = RequestMethod.POST)
 	 public String addFilmo(int fseq, String Actor){
 		 System.out.println("ReviewController addFilmo()");
 		 
 		 ActorDto actor = aservice.getAid(Actor);
 		 try {
 	 	     fservice.addFilmo(fseq, actor.getAid());  
 		 }catch(NullPointerException e) {
 			 return "fail";
 		 }
 		 return "success";
 	 }
}
