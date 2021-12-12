package com.solid.osp.loan_ocp_handler;

public class LoanApprovalHandler {
    public void approveLoan(PersonalLoanValidator validator) {
        if (validator.isValid()) {

        }
    }

    public void approveLoan(VehicleLoanValidator validator) {
        if (validator.isValid()) {

        }
    }
}

class PersonalLoanValidator {
    public boolean isValid() {
        return true;
    }
}

class VehicleLoanValidator {
    public boolean isValid() {
        return true;
    }
}