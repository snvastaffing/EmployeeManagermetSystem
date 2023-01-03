package com.snva.employeelist.uiservice;

import com.snva.employeelist.bean.CallSummary;
import com.snva.employeelist.service.FileServiceImpl;
import com.snva.employeelist.service.IFileService;
import com.snva.employeelist.util.ReadUtil;
import com.sun.imageio.plugins.common.ReaderUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileUiServiceImpl implements IFileUiService {

    com.snva.employeelist.util.ReadUtil readUtil;
    IFileService iFileService;

    public FileUiServiceImpl(){
        readUtil= new ReadUtil();
        iFileService= new FileServiceImpl();
    }






    @Override
    public void processFile() throws IOException {
       String filePath= readUtil.readString("Please enter a file path","Error could not read the input ");
       // check if this file path exists
        File isValidPath= new File(filePath);
        if (isValidPath.exists()){
            String savePath=iFileService.saveToFile(iFileService.processFile(isValidPath));
            System.out.println("The file was created at  "+savePath);
        }else{
            System.out.println("The path "+filePath+" doeas not exist");
        }

    }
}
