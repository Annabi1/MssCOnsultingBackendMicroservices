package org.mss.seaTravel.service;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.mss.seaTravel.model.Travel;
import org.mss.seaTravel.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class TravelServiceImpl  implements ITravelsService{
	@Autowired
	private TravelRepository travelRepo;
		@Override
		public Travel createTravel(Travel travel) {
			Optional<Travel> searchTravel=travelRepo.findByDestination(travel.getDestination());
			if (searchTravel.isEmpty())
				return travelRepo.save(travel);
			else
			return null;
		}
		@Override
		public List<Travel> findAll() {
			// TODO Auto-generated method stub
			return travelRepo.findAll();
		}
		@Override
		public Travel save(@Valid Travel travel) {
			// TODO Auto-generated method stub
			Optional<Travel> travelSearched=travelRepo.findByDestination(travel.getDestination());
			if( travelSearched.isEmpty()) {
				travel.setAvailable(false);
				return travelRepo.save(travel);
			}
			else
			return null;
			
		}
		@Override
		public void deleteTravel(long id ) {
			// TODO Auto-generated method stub
			travelRepo.deleteById(id);
		}
		@Override
		public Travel updateTravelAvialbale(long id) {
			// TODO Auto-generated method stub
			Optional<Travel> searchTravel=travelRepo.findById(id);
			if(searchTravel.get().getAvailable()==true)
			{
				searchTravel.get().setAvailable(false);
			}
			else 			searchTravel.get().setAvailable(true);

			return searchTravel.get();
		}
		@Override
		public Optional<Travel> getTravelById(long id) {
			// TODO Auto-generated method stub
			return travelRepo.findById(id);
		}

	}

