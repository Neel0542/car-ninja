package com.example.TDDCRUD.Services;

import com.example.TDDCRUD.models.Widget;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class WidgetServiceImpl implements  WidgetService{
    @Override
    public List<Widget> getAllWidgets() {
        return List.of();
    }

    @Override
    public Widget getWidgetById(Long id) {
        return null;
    }

    @Override
    public Widget createWidget(Widget widget) {
        return null;
    }

    @Override
    public Widget updateWidget(Long id, Widget widget) {
        return null;
    }

    @Override
    public void deleteWidget(Long id) {

    }
}
