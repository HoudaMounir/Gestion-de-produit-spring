package com.example.gestinProduit.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class ProductDto {
        @NotEmpty(message = "The name is required")
        private String name;
        @NotEmpty(message = "The brand is required")
        private String brand;
        @NotEmpty(message = "The category is required")
        private String category;
        @Min(0)
        private double price;
        @Size(min=10, message="The desciption should be at least 10 characters")
        @Size(min=200, message="The desciption cannot exceed 200 characters")
        private String description;
        private MultipartFile imageFileName;

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public MultipartFile getImageFileName() {
        return imageFileName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageFileName(MultipartFile imageFileName) {
        this.imageFileName = imageFileName;
    }
}
