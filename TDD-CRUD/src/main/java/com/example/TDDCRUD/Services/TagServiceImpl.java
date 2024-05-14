package com.example.TDDCRUD.Services;

import com.example.TDDCRUD.Repo.TagRepository;
import com.example.TDDCRUD.models.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j

public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository; // Assuming you have a repository for Tag

    @Override
    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    @Override
    public Tag getTagById(Long id) {
        return tagRepository.findById(id).orElse(null);
    }

    @Override
    public Tag createTag(Tag tag) {
        // Add logic for validation before saving

        return tagRepository.save(tag);
    }

    @Override
    public Tag updateTag(Long id, Tag tag) {
        // Add logic to fetch existing tag, update its properties, and save it
        return tagRepository.save(tag);
    }

    @Override
    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }
}
