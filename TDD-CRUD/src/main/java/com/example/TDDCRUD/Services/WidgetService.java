package com.example.TDDCRUD.Services;

import com.example.TDDCRUD.models.Widget;

import java.util.List;

public interface WidgetService {
    List<Widget> getAllWidgets();
    Widget getWidgetById(Long id);
    Widget createWidget(Widget widget);
    Widget updateWidget(Long id, Widget widget);
    void deleteWidget(Long id);
}
