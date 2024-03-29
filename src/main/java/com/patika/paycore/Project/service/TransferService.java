package com.patika.paycore.Project.service;

import com.patika.paycore.Project.exception.InsufficientBalanceException;
import com.patika.paycore.Project.model.entity.Transfer;
import com.patika.paycore.Project.model.dto.TransferDto;

import java.util.List;

public interface TransferService {
    List<Transfer> getAllTransfers();

    Transfer getTransfer(Integer id);

    void addTransfer(TransferDto transfer) throws InsufficientBalanceException;

    Transfer updateTransfer(Integer id, Transfer transfer);

    boolean deleteTransfer(Integer id);


}
