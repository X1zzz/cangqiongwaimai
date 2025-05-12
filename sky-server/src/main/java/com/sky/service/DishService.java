package com.sky.service;

import com.sky.entity.Dish;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {
    /**
     * 根据分类id查询菜品
     * @param categoryId
     * @return
     */
    List<Dish> list(Long categoryId);


    /**
     * 条件查询菜品和口味
     * @param dish
     * @return
     */
    List<DishVO> listWithFlavor(Dish dish);
}
