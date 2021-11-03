package ru.ims.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ims.api.data.MailData;

@RestController
public class MyRestController {

    @GetMapping("/3dspace/resources/ase/documents/v1/mail")
    public String getMails(@RequestParam String category){
        return MailData.getMails();
    }

    @GetMapping("/3dspace/resources/ase/documents/v1/mail/{id}")
    public String getSingleMail(@PathVariable String id){
        return MailData.getSingleMail();
    }


    @GetMapping("/3dspace/resources/ase/documents/v1/mail/searchMails")
    public String searchMail(@RequestParam String generalQuery){
        return MailData.getSearchedMails();
    }
}
