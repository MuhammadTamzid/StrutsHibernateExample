package com.framgia.member.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.framgia.member.model.Member;
import org.hibernate.cfg.Configuration;

public class ListMemberAction extends Action{
    public ActionForward execute(ActionMapping mapping,ActionForm form,
                                 HttpServletRequest request,HttpServletResponse response)
            throws Exception {

        SessionFactory sessionFactory = new Configuration()
                .configure("/hibernate.cfg.xml")
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        DynaActionForm dynaMemberListForm = (DynaActionForm)form;

        List<Member> list = session.createQuery("from Member").list();

        dynaMemberListForm.set("memberList", list);

        return mapping.findForward("success");
    }
}
