package services;

import java.util.ArrayList;
import java.util.List;

import beans.Tvshow;
import dao.IDao;

public class TvshowService implements IDao<Tvshow> {
    private List<Tvshow> tvshows;
    private static TvshowService instance;
    private TvshowService() {
        this.tvshows = new ArrayList<>();
    }
    public static TvshowService getInstance() {
        if(instance == null)
            instance = new TvshowService();
        return instance;
    }
    @Override
    public boolean create(Tvshow o) {
        return tvshows.add(o);
    }
    @Override
    public boolean update(Tvshow o) {
        for(Tvshow t : tvshows){
            if(t.getId() == o.getId()){
                t.setImageUrl(o.getImageUrl());
                t.setDetails(o.getDetails());
                t.setType(o.getType());
                t.setTitle(t.getTitle());
                t.setStars(t.getStars());
            }
        }
        return true;
    }
    @Override
    public boolean delete(Tvshow o) {
        return tvshows.remove(o);
    }
    @Override
    public Tvshow findById(int id) {
        for(Tvshow t : tvshows){
            if(t.getId() == id)
                return t;
        }
        return null;
    }
    @Override
    public List<Tvshow> findAll() {
        return tvshows;
    }
}

