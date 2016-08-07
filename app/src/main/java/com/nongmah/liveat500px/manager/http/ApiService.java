package com.nongmah.liveat500px.manager.http;

import com.nongmah.liveat500px.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by JoJo on 8/6/16.
 */
public interface ApiService {
    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();
}
