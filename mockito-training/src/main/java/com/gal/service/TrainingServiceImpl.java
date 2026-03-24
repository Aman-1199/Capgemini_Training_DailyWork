package com.gal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gal.model.Training;
import com.gal.service.TrainingService;
@Service
public class TrainingServiceImpl implements TrainingService {

	@Override
	public List<Training> findByTopic(String topic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Training findById(int trainingid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Training addTraining(Training training) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Training upTraining(Training training) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTraining(int trainingid) {
		// TODO Auto-generated method stub
		return false;
	}

}
