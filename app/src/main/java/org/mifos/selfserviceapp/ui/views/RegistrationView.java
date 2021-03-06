package org.mifos.selfserviceapp.ui.views;

import org.mifos.selfserviceapp.ui.views.base.MVPView;

/**
 * Created by dilpreet on 31/7/17.
 */

public interface RegistrationView extends MVPView {

    void showRegisteredSuccessfully();

    void showError(String msg);
}
