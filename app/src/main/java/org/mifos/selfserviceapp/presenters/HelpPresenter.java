package org.mifos.selfserviceapp.presenters;

import android.content.Context;

import org.mifos.selfserviceapp.R;
import org.mifos.selfserviceapp.injection.ActivityContext;
import org.mifos.selfserviceapp.models.FAQ;
import org.mifos.selfserviceapp.presenters.base.BasePresenter;
import org.mifos.selfserviceapp.ui.views.HelpView;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by dilpreet on 12/8/17.
 */

public class HelpPresenter extends BasePresenter<HelpView> {

    @Inject
    protected HelpPresenter(@ActivityContext Context context) {
        super(context);
    }

    @Override
    public void attachView(HelpView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    public void loadFaq() {

        String[] qs = context.getResources().getStringArray(R.array.faq_qs);
        String[] ans = context.getResources().getStringArray(R.array.faq_ans);
        ArrayList<FAQ> faqArrayList = new ArrayList<>();

        for (int i = 0; i < qs.length; i++) {
            faqArrayList.add(new FAQ(qs[i], ans[i]));
        }

        getMvpView().showFaq(faqArrayList);
    }

    public ArrayList<FAQ> filterList(ArrayList<FAQ> faqArrayList, String query) {
        ArrayList<FAQ> filteredList = new ArrayList<>();
        for (FAQ faq : faqArrayList) {
            if (faq.getQuestion().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(faq);
            }
        }
        return filteredList;
    }
}
