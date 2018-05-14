package com.framgia.member.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class MemberForm extends ActionForm {
    private String name;
    private String email;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        ActionErrors errors = new ActionErrors();

        if( getName() == null || ("".equals(getName()))) {
            errors.add("member.err.name",
                    new ActionMessage("member.err.name.required"));
        }

        if( getEmail() == null || ("".equals(getEmail()))) {
            errors.add("common.email.err",
                    new ActionMessage("member.err.email.required"));
        }

        return errors;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        // reset properties
        name = "";
        email = "";
    }
}
