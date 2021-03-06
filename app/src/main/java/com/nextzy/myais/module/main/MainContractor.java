package com.nextzy.myais.module.main;

import com.nextzy.myais.common.mvp.NextzyContractorPresenter;
import com.nextzy.myais.common.mvp.NextzyContractorView;

/**
 * Created by Akexorcist on 8/1/16 AD.
 */
public class MainContractor {

    public interface Presenter extends NextzyContractorPresenter {
        void onButtonOkClicked();

        void onButtonSaveClicked(String message);

        String getMessage();

        void setMessage(String message);
    }

    public interface View extends NextzyContractorView<Presenter> {
        void showToastMessage();

        void showSavedMessage(String message);
    }

}
