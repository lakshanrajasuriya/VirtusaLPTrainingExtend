package com.lakshan.factorymethod.datapackage;

import com.lakshan.factorymethod.service.AnytimeData;
import com.lakshan.factorymethod.service.EmailService;
import com.lakshan.factorymethod.service.SpamProtection;

public class HomeExtraPackage extends Package {
    public void createPackage() {
        services.add(new AnytimeData());
        services.add(new EmailService());
        services.add(new SpamProtection());
    }
}
