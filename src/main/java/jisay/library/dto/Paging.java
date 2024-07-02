package jisay.library.dto;


import java.util.List;

public class Paging<DTO> {

    private int totalPages;
    private int currentPage;
    private List<DTO> page;

    public Paging(int totalPages, int currentPage, List<DTO> page) {
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.page = page;
    }


}
