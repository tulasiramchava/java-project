package com.training.assignment.controller;

import com.training.assignment.framework.Menu;
import com.training.assignment.service.MenuService;

import java.util.List;

public class MenuController {

    private MenuService menuService = new MenuService();

    public List<Menu> menus() {
        return menuService.menus();
    }
}
