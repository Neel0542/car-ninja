package com.example.TDDCRUD.controllers;

import com.example.TDDCRUD.Services.WidgetService;
import com.example.TDDCRUD.Services.WidgetServiceImpl;
import com.example.TDDCRUD.models.Widget;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/widgets")
public class WidgetController {

    private final WidgetServiceImpl widgetService;

    @GetMapping("get")
    public List<Widget> getAllWidgets() {
        return widgetService.getAllWidgets();
    }

    @GetMapping("/{id}")
    public Widget getWidgetById(@PathVariable Long id) {
        return widgetService.getWidgetById(id);
    }

    @PostMapping
    public Widget createWidget(@RequestBody Widget widget) {
        return widgetService.createWidget(widget);
    }

    @PutMapping("/{id}")
    public Widget updateWidget(@PathVariable Long id, @RequestBody Widget widget) {
        return widgetService.updateWidget(id, widget);
    }

    @DeleteMapping("/{id}")
    public void deleteWidget(@PathVariable Long id) {
        widgetService.deleteWidget(id);
    }
}
