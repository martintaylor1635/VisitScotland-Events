package com.visitscotland.events.category;

import java.util.UUID;

record CategoryResponse(
    UUID id,
    String name
) { }