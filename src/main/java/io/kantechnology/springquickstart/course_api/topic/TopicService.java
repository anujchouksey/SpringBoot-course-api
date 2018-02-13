package io.kantechnology.springquickstart.course_api.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics =new ArrayList<>(Arrays.asList(

			new Topic("Spring", "Spring FrameworK", "Spring Description"),
			new Topic("SpringBoot", "SpringPado", "Free Description"),
			new Topic("SpringSahihai", "Sab FrameworK", "Main Description")));

	public List<Topic> getAllTopics()	
	{
		return topics;
	}
	
	
	public Topic gettopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}


	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}


	public void updateTopic(Topic topic, String id) {
		for(int i=0;i<topics.size();i++)
		{
		Topic t=topics.get(i);
		if(t.getId().equals(id)) {
			topics.set(i, topic);
			return;
		}
		}
		
	}


	public void deleteTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t ->t.getId().equals(id));
	}
	

}
