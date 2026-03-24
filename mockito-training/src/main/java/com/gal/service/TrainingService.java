package com.gal.service;

import java.util.List;

import com.gal.model.Training;

public interface TrainingService {
	List<Training>findByTopic(String topic);
	Training findById(int trainingid);
	Training addTraining(Training training);
	Training upTraining(Training training);
	boolean deleteTraining(int trainingid);
}
