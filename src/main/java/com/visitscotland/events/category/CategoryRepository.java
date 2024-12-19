package com.visitscotland.events.category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface CategoryRepository extends CrudRepository<Category, UUID>
{ }