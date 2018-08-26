package com.example.demo4.domain;

import java.util.List;

/**
 * Created by Dima on 26.08.2018.
 */

public interface AdvertiserService {

        void create(Advertiser advertiser);

        List<Advertiser> getAll();

        void delete(Advertiser advertiser);

}
