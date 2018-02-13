package io.kantechnology.springquickstart.course_api.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // return as json already spring mvc does automatically
public class TopicController {
	@Autowired
	private TopicService topicService;

	
	//root
	@RequestMapping("/topics")
	public List<Topic> getalltopics() {
		return topicService.getAllTopics();
	}
//individual
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.gettopic(id);
	}

	// in order to specify post (enumeration) map this method to any req which is
	// method post
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	// get post body coverted to body is through reqbody in topic instance
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	// put body coverted to body is through reqbody in topic instance
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(topic, id);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	//get Delete body coverted to body is through reqbody in topic instance 
	public void deleteTopic(@RequestBody Topic topic,@PathVariable String id) {
	 topicService.deleteTopic(topic,id);
	}

}
