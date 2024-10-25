package com.example.server.dto;

import com.example.server.entity.ProductEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private int id;
    private String name;
    private int price;
    private int deliveryPrice;
    private int addDeliveryPrice;
    private String tags;
    private int outboundDays;
    private String activeYn;
    private CategoryDTO category;  // 연관된 카테고리 정보
    private SellerDTO seller;      // 연관된 셀러 정보
//    private List<ImageDTO> imageEntityList;  // 이미지 정보 리스트

    public static ProductDTO toProductDTO(ProductEntity product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setDeliveryPrice(product.getDeliveryPrice());
        dto.setAddDeliveryPrice(product.getAddDeliveryPrice());
        dto.setTags(product.getTags());
        dto.setOutboundDays(product.getOutboundDays());
        dto.setActiveYn(product.getActiveYn());

        // CategoryEntity -> CategoryDTO
        if (product.getCategory() != null) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(product.getCategory().getId());
            categoryDTO.setCategory1(product.getCategory().getCategory1());
            categoryDTO.setCategory2(product.getCategory().getCategory2());
            categoryDTO.setCategory3(product.getCategory().getCategory3());
            dto.setCategory(categoryDTO);
        }

        // SellerEntity -> SellerDTO
        if (product.getSeller() != null) {
            SellerDTO sellerDTO = new SellerDTO();
            sellerDTO.setId(product.getSeller().getId());
            sellerDTO.setName(product.getSeller().getName());
            sellerDTO.setEmail(product.getSeller().getEmail());
            sellerDTO.setPhone(product.getSeller().getPhone());
            dto.setSeller(sellerDTO);
        }

//        // ImageEntity -> ImageDTO
//        if (product.getImageEntityList() != null) {
//            List<ImageDTO> imageDTOList = product.getImageEntityList().stream().map(image -> {
//                ImageDTO imageDTO = new ImageDTO();
//                imageDTO.setId(image.getId());
//                imageDTO.setImageUrl(image.getImageUrl());  // 필요한 필드만 추가
//                return imageDTO;
//            }).collect(Collectors.toList());
//            dto.setImageEntityList(imageDTOList);
//        }

        return dto;
    }
}
