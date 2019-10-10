package com.cartisan.huiduoduo.dtos;

import com.cartisan.huiduoduo.domains.Category;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author colin
 */
@Data
@AllArgsConstructor
public class CategoryDto {
    private String id;
    private String name;
    private String icon;
    private Integer sort;

    public static CategoryDto convertFrom(Category category) {
        return new CategoryDto(
                category.getId().toString(), category.getName(), category.getIcon(), category.getSort());
    }
}
