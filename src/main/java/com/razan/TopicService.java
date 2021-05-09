package com.razan;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics = Arrays.asList(
						new Topic("spring", "Spring Framework", "Spring Framework description"),
						new Topic("java", "Core Java", "Core Java description"),
						new Topic("javascript", "Javascript", "Javascript description")
						);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
