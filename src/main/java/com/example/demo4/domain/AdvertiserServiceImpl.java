package com.example.demo4.domain;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AdvertiserServiceImpl implements AdvertiserService {


    private AdvertiserRepository repository;

    public AdvertiserServiceImpl(AdvertiserRepository repository) {
        this.repository = repository;
    }


    @Override
    public void create(Advertiser advertiser) {
        repository.save(advertiser);

    }

    @Override
    public List<Advertiser> getAll() {
            List<Advertiser> list = new ArrayList<>();
            for (Advertiser article : repository.findAll()) {
                list.add(article);
            }
            return list;
    }


    @Override
    public void delete(Advertiser advertiser) {
            repository.delete(advertiser);
    }


}

