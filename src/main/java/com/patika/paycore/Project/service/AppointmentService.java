package com.patika.paycore.Project.service;

import com.patika.paycore.Project.model.Appointment;
import com.patika.paycore.Project.model.User;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAllAppointments();

    Appointment getAppointment(Integer id);

    void addAppointment(Appointment appointment);

    Appointment updateAppointment(Integer id, Appointment appointment);

    boolean deleteAppointment(Integer id);
}
