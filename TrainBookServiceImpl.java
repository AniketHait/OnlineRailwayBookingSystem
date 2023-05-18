package com.toy.Online_Railway_System.service;

import com.toy.Online_Railway_System.dao.UserDao;
import com.toy.Online_Railway_System.model.TrainBook;
import com.toy.Online_Railway_System.model.TrainDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class TrainBookServiceImpl implements TrainBookService {
    @Autowired
    private UserDao userDao;

    @Override
    public String saveTrains(List<TrainDetails> details) {
        return null;
    }

    @Override
    public List<TrainDetails> getTrains() {
        return null;
    }

    @Override
    public Optional<TrainDetails> getTrain(Integer trainId) {
        return Optional.empty();
    }

    @Override
    public String updateTrain(TrainDetails detail) {
        return null;
    }

    @Override
    public String deleteTrain(Integer id) {
        return null;
    }

    @Override
    public String bookticket(TrainBook book) {
        userDao.save(book);
        return "Ticket Booked";
    }

    @Override
    public List<TrainBook> showMyticket() {
        return userDao.findAll();
    }

    @Override
    public String cancelTicket(Integer id) {
        userDao.deleteById(id);
        return "Ticket cancelled";
    }
}
