package com.webkoding.wbkdngcustomers.controller;

import com.webkoding.wbkdngcustomers.dto.response.Response;
import com.webkoding.wbkdngcustomers.service.GetCustomersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final GetCustomersService getCustomersService;

    @PostMapping("/")
    public void createCustomer() {

    }

    @GetMapping("/")
    public Response getCustomers(@RequestHeader(value = "x-manager-id", required = false) String managerId) {
        return Response.ok().setPayload(getCustomersService.getCustomers(managerId));
    }
}
