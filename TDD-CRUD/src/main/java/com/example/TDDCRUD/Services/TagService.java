package com.example.TDDCRUD.Services;


import com.example.TDDCRUD.models.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public interface TagService {
    List<Tag> getAllTags();
    Tag getTagById(Long id);
    Tag createTag(Tag tag);
    Tag updateTag(Long id, Tag tag);
    void deleteTag(Long id);
}
