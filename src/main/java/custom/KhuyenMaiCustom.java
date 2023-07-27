/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custom;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author admin
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class KhuyenMaiCustom {
    
    private int id;
    
    private String maKM;
    
    private int phanTram;
    
    private Date ngayBatDau;
    
    private Date ngayKetThuc;
    
    private int trangThai;
}
