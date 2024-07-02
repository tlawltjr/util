package jisay.library.module;

import jisay.library.dto.Paging;

import java.util.List;

public class Pages<DTO> {

    public int getTotalPages(List<DTO> list,int num) {
        Paging dto = new Paging(list.size() / 10,num,list);
        return 1;
    }

    public <DTO> List<DTO> getPage(List<DTO> originalList, int pageNumber, int pageSize){
        int start = (pageNumber - 1) * pageSize;
        int end = Math.min(start + pageSize, originalList.size());

        return originalList.subList(start, end);
    }
}
