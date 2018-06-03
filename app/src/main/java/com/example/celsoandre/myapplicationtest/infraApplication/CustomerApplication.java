package com.example.celsoandre.myapplicationtest.infraApplication;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;
import com.example.celsoandre.myapplicationtest.entities.Category;
import com.example.celsoandre.myapplicationtest.entities.Item;

public class CustomerApplication extends com.activeandroid.app.Application {

    /**
     * link de modelo:
     * https://www.future-processing.pl/blog/persist-your-data-activeandroid-and-parse/
     * https://github.com/pardom-zz/ActiveAndroid/wiki/Creating-your-database-model
     *
     *
     */


    @Override
    public void onCreate() {
        super.onCreate();

        //ActiveAndroid.initialize(CustomerApplication.this);


        //Configuration dbConfiguration = new Configuration.Builder(this).setDatabaseName("DataBaseTest.db").create();
        //ActiveAndroid.initialize(dbConfiguration);

        Configuration.Builder configurationBuilder = new Configuration.Builder(this);

        configurationBuilder.setDatabaseName("DataBaseTest.db").create();

        configurationBuilder.addModelClasses(Category.class, Item.class);

        ActiveAndroid.initialize(CustomerApplication.this);



    }
}
