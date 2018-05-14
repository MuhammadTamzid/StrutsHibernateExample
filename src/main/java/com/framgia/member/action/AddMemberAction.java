package com.framgia.member.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.framgia.member.form.MemberForm;
import com.framgia.member.model.Member;
import org.hibernate.cfg.Configuration;

public class AddMemberAction extends Action{
    public ActionForward execute(ActionMapping mapping,ActionForm form,
                                 HttpServletRequest request,HttpServletResponse response)
            throws Exception {

        SessionFactory sessionFactory = new Configuration()
                .configure("/hibernate.cfg.xml")
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        MemberForm memberForm = (MemberForm)form;
        Member member = new Member();

        //copy memberform to model
        BeanUtils.copyProperties(member, memberForm);

        //save data
        member.setCreatedDate(new Date());

        session.beginTransaction();
        session.save(member);
        session.getTransaction().commit();

        return mapping.findForward("success");

    }
}
