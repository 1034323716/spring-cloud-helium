package com.feinno.superpojo;

/**
 * 模板文件，该文件存储了辅助类动态成生时需要的模板
 *
 * @author Lv.Mingwei
 */
public class ClassTemplate {

    /**
     * 这个是用于生成SuperPojoEntity辅助类时使用的模板
     */
    public static final String PROTO_NATIVE_ENTITY_CODE_TEMPLATE = new String(new byte[]{0x70, 0x61, 0x63, 0x6B,
            0x61, 0x67, 0x65, 0x20, 0x24, 0x7B, 0x70, 0x61, 0x63, 0x6B, 0x61, 0x67, 0x65, 0x4E, 0x61, 0x6D, 0x65, 0x7D,
            0x3B, 0x0A, 0x0A, 0x70, 0x75, 0x62, 0x6C, 0x69, 0x63, 0x20, 0x63, 0x6C, 0x61, 0x73, 0x73, 0x20, 0x24, 0x7B,
            0x63, 0x6C, 0x61, 0x73, 0x73, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x20, 0x65, 0x78, 0x74, 0x65, 0x6E, 0x64, 0x73,
            0x20, 0x24, 0x7B, 0x70, 0x61, 0x63, 0x6B, 0x61, 0x67, 0x65, 0x52, 0x6F, 0x6F, 0x74, 0x7D, 0x2E, 0x4E, 0x61,
            0x74, 0x69, 0x76, 0x65, 0x53, 0x75, 0x70, 0x65, 0x72, 0x50, 0x6F, 0x6A, 0x6F, 0x3C, 0x24, 0x7B, 0x66, 0x69,
            0x65, 0x6C, 0x64, 0x54, 0x79, 0x70, 0x65, 0x7D, 0x3E, 0x20, 0x7B, 0x0A, 0x0A, 0x09, 0x40, 0x24, 0x7B, 0x61,
            0x6E, 0x6E, 0x6F, 0x50, 0x61, 0x74, 0x68, 0x7D, 0x2E, 0x46, 0x69, 0x65, 0x6C, 0x64, 0x28, 0x69, 0x64, 0x3D,
            0x31, 0x29, 0x0A, 0x09, 0x70, 0x72, 0x69, 0x76, 0x61, 0x74, 0x65, 0x20, 0x24, 0x7B, 0x66, 0x69, 0x65, 0x6C,
            0x64, 0x54, 0x79, 0x70, 0x65, 0x7D, 0x20, 0x24, 0x7B, 0x66, 0x69, 0x65, 0x6C, 0x64, 0x4E, 0x61, 0x6D, 0x65,
            0x7D, 0x3B, 0x0A, 0x0A, 0x09, 0x70, 0x75, 0x62, 0x6C, 0x69, 0x63, 0x20, 0x76, 0x6F, 0x69, 0x64, 0x20, 0x24,
            0x7B, 0x66, 0x69, 0x65, 0x6C, 0x64, 0x53, 0x65, 0x74, 0x74, 0x65, 0x72, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x28,
            0x24, 0x7B, 0x66, 0x69, 0x65, 0x6C, 0x64, 0x54, 0x79, 0x70, 0x65, 0x7D, 0x20, 0x24, 0x7B, 0x66, 0x69, 0x65,
            0x6C, 0x64, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x29, 0x20, 0x7B, 0x0A, 0x09, 0x09, 0x74, 0x68, 0x69, 0x73, 0x2E,
            0x24, 0x7B, 0x66, 0x69, 0x65, 0x6C, 0x64, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x20, 0x3D, 0x20, 0x24, 0x7B, 0x66,
            0x69, 0x65, 0x6C, 0x64, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x3B, 0x0A, 0x09, 0x7D, 0x0A, 0x0A, 0x09, 0x70, 0x75,
            0x62, 0x6C, 0x69, 0x63, 0x20, 0x24, 0x7B, 0x66, 0x69, 0x65, 0x6C, 0x64, 0x54, 0x79, 0x70, 0x65, 0x7D, 0x20,
            0x24, 0x7B, 0x66, 0x69, 0x65, 0x6C, 0x64, 0x47, 0x65, 0x74, 0x74, 0x65, 0x72, 0x4E, 0x61, 0x6D, 0x65, 0x7D,
            0x28, 0x29, 0x20, 0x7B, 0x0A, 0x09, 0x09, 0x72, 0x65, 0x74, 0x75, 0x72, 0x6E, 0x20, 0x74, 0x68, 0x69, 0x73,
            0x2E, 0x24, 0x7B, 0x66, 0x69, 0x65, 0x6C, 0x64, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x3B, 0x0A, 0x09, 0x7D, 0x0A,
            0x0A, 0x09, 0x40, 0x4F, 0x76, 0x65, 0x72, 0x72, 0x69, 0x64, 0x65, 0x0A, 0x09, 0x70, 0x75, 0x62, 0x6C, 0x69,
            0x63, 0x20, 0x24, 0x7B, 0x66, 0x69, 0x65, 0x6C, 0x64, 0x54, 0x79, 0x70, 0x65, 0x7D, 0x20, 0x67, 0x65, 0x74,
            0x44, 0x61, 0x74, 0x61, 0x28, 0x29, 0x20, 0x7B, 0x0A, 0x09, 0x09, 0x72, 0x65, 0x74, 0x75, 0x72, 0x6E, 0x20,
            0x74, 0x68, 0x69, 0x73, 0x2E, 0x24, 0x7B, 0x66, 0x69, 0x65, 0x6C, 0x64, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x3B,
            0x0A, 0x09, 0x7D, 0x0A, 0x0A, 0x09, 0x40, 0x4F, 0x76, 0x65, 0x72, 0x72, 0x69, 0x64, 0x65, 0x0A, 0x09, 0x70,
            0x75, 0x62, 0x6C, 0x69, 0x63, 0x20, 0x76, 0x6F, 0x69, 0x64, 0x20, 0x73, 0x65, 0x74, 0x44, 0x61, 0x74, 0x61,
            0x28, 0x24, 0x7B, 0x66, 0x69, 0x65, 0x6C, 0x64, 0x54, 0x79, 0x70, 0x65, 0x7D, 0x20, 0x24, 0x7B, 0x66, 0x69,
            0x65, 0x6C, 0x64, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x29, 0x20, 0x7B, 0x0A, 0x09, 0x09, 0x74, 0x68, 0x69, 0x73,
            0x2E, 0x24, 0x7B, 0x66, 0x69, 0x65, 0x6C, 0x64, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x20, 0x3D, 0x20, 0x24, 0x7B,
            0x66, 0x69, 0x65, 0x6C, 0x64, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x3B, 0x0A, 0x09, 0x7D, 0x0A, 0x0A, 0x09, 0x40,
            0x4F, 0x76, 0x65, 0x72, 0x72, 0x69, 0x64, 0x65, 0x0A, 0x09, 0x70, 0x75, 0x62, 0x6C, 0x69, 0x63, 0x20, 0x24,
            0x7B, 0x70, 0x61, 0x63, 0x6B, 0x61, 0x67, 0x65, 0x52, 0x6F, 0x6F, 0x74, 0x7D, 0x2E, 0x4E, 0x61, 0x74, 0x69,
            0x76, 0x65, 0x53, 0x75, 0x70, 0x65, 0x72, 0x50, 0x6F, 0x6A, 0x6F, 0x3C, 0x24, 0x7B, 0x66, 0x69, 0x65, 0x6C,
            0x64, 0x54, 0x79, 0x70, 0x65, 0x7D, 0x3E, 0x20, 0x6E, 0x65, 0x77, 0x49, 0x6E, 0x73, 0x74, 0x61, 0x6E, 0x63,
            0x65, 0x28, 0x29, 0x20, 0x7B, 0x0A, 0x09, 0x09, 0x72, 0x65, 0x74, 0x75, 0x72, 0x6E, 0x20, 0x6E, 0x65, 0x77,
            0x20, 0x24, 0x7B, 0x63, 0x6C, 0x61, 0x73, 0x73, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x28, 0x29, 0x3B, 0x0A, 0x09,
            0x7D, 0x0A, 0x7D});

    /**
     * 这个是自动成SuperPojoBuilder时使用的模板
     */
    public static final String PROTO_BUILDER_TEMPLATE = new String(new byte[]{0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x20,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x4E,0x61,0x6D,0x65,0x7D,0x3B,0x0A,0x0A,0x69,0x6D,0x70,0x6F,0x72,0x74,0x20,0x6A,0x61,0x76,0x61,0x2E,0x69,0x6F,0x2E,0x49,0x4F,0x45,0x78,0x63,0x65,0x70,0x74,0x69,0x6F,0x6E,0x3B,0x0A,0x69,0x6D,0x70,0x6F,0x72,0x74,0x20,0x6A,0x61,0x76,0x61,0x78,0x2E,0x78,0x6D,0x6C,0x2E,0x73,0x74,0x72,0x65,0x61,0x6D,0x2E,0x58,0x4D,0x4C,0x53,0x74,0x72,0x65,0x61,0x6D,0x45,0x78,0x63,0x65,0x70,0x74,0x69,0x6F,0x6E,0x3B,0x0A,0x0A,0x70,0x75,0x62,0x6C,0x69,0x63,0x20,0x63,0x6C,0x61,0x73,0x73,0x20,0x24,0x7B,0x62,0x75,0x69,0x6C,0x64,0x65,0x72,0x43,0x6C,0x61,0x73,0x73,0x4E,0x61,0x6D,0x65,0x7D,0x20,0x65,0x78,0x74,0x65,0x6E,0x64,0x73,0x20,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x43,0x6F,0x72,0x65,0x52,0x6F,0x6F,0x74,0x7D,0x2E,0x42,0x75,0x69,0x6C,0x64,0x65,0x72,0x3C,0x24,0x7B,0x63,0x6C,0x61,0x73,0x73,0x4E,0x61,0x6D,0x65,0x7D,0x3E,0x20,0x7B,0x0A,0x0A,0x09,0x3C,0x23,0x6C,0x69,0x73,0x74,0x20,0x67,0x6C,0x6F,0x62,0x61,0x6C,0x43,0x6F,0x64,0x65,0x4C,0x69,0x73,0x74,0x20,0x61,0x73,0x20,0x63,0x6F,0x64,0x65,0x3E,0x0A,0x09,0x24,0x7B,0x63,0x6F,0x64,0x65,0x7D,0x0A,0x09,0x3C,0x2F,0x23,0x6C,0x69,0x73,0x74,0x3E,0x0A,0x0A,0x09,0x70,0x75,0x62,0x6C,0x69,0x63,0x20,0x24,0x7B,0x62,0x75,0x69,0x6C,0x64,0x65,0x72,0x43,0x6C,0x61,0x73,0x73,0x4E,0x61,0x6D,0x65,0x7D,0x28,0x66,0x69,0x6E,0x61,0x6C,0x20,0x24,0x7B,0x63,0x6C,0x61,0x73,0x73,0x4E,0x61,0x6D,0x65,0x7D,0x20,0x64,0x61,0x74,0x61,0x29,0x20,0x7B,0x0A,0x09,0x09,0x73,0x75,0x70,0x65,0x72,0x28,0x64,0x61,0x74,0x61,0x29,0x3B,0x0A,0x09,0x7D,0x0A,0x0A,0x09,0x40,0x4F,0x76,0x65,0x72,0x72,0x69,0x64,0x65,0x0A,0x09,0x70,0x75,0x62,0x6C,0x69,0x63,0x20,0x76,0x6F,0x69,0x64,0x20,0x70,0x61,0x72,0x73,0x65,0x50,0x62,0x46,0x72,0x6F,0x6D,0x28,0x66,0x69,0x6E,0x61,0x6C,0x20,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x43,0x6F,0x72,0x65,0x49,0x6F,0x7D,0x2E,0x43,0x6F,0x64,0x65,0x64,0x49,0x6E,0x70,0x75,0x74,0x53,0x74,0x72,0x65,0x61,0x6D,0x20,0x69,0x6E,0x70,0x75,0x74,0x29,0x20,0x74,0x68,0x72,0x6F,0x77,0x73,0x20,0x49,0x4F,0x45,0x78,0x63,0x65,0x70,0x74,0x69,0x6F,0x6E,0x20,0x7B,0x0A,0x09,0x09,0x3C,0x23,0x69,0x66,0x20,0x70,0x61,0x72,0x73,0x65,0x46,0x6F,0x6F,0x74,0x65,0x72,0x45,0x78,0x69,0x73,0x74,0x73,0x20,0x3E,0x0A,0x09,0x09,0x6A,0x61,0x76,0x61,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x4D,0x61,0x70,0x3C,0x49,0x6E,0x74,0x65,0x67,0x65,0x72,0x2C,0x6A,0x61,0x76,0x61,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x4C,0x69,0x73,0x74,0x3C,0x3F,0x3E,0x3E,0x20,0x61,0x72,0x72,0x61,0x79,0x54,0x79,0x70,0x65,0x74,0x4D,0x61,0x70,0x20,0x3D,0x20,0x6E,0x65,0x77,0x20,0x6A,0x61,0x76,0x61,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x48,0x61,0x73,0x68,0x4D,0x61,0x70,0x3C,0x6A,0x61,0x76,0x61,0x2E,0x6C,0x61,0x6E,0x67,0x2E,0x49,0x6E,0x74,0x65,0x67,0x65,0x72,0x2C,0x20,0x6A,0x61,0x76,0x61,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x4C,0x69,0x73,0x74,0x3C,0x3F,0x3E,0x3E,0x28,0x29,0x3B,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x69,0x66,0x3E,0x0A,0x09,0x09,0x77,0x68,0x69,0x6C,0x65,0x20,0x28,0x74,0x72,0x75,0x65,0x29,0x20,0x7B,0x0A,0x09,0x09,0x09,0x69,0x6E,0x74,0x20,0x74,0x61,0x67,0x20,0x3D,0x20,0x69,0x6E,0x70,0x75,0x74,0x2E,0x72,0x65,0x61,0x64,0x54,0x61,0x67,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x73,0x77,0x69,0x74,0x63,0x68,0x20,0x28,0x74,0x61,0x67,0x29,0x20,0x7B,0x0A,0x09,0x09,0x09,0x63,0x61,0x73,0x65,0x20,0x30,0x3A,0x0A,0x09,0x09,0x09,0x09,0x3C,0x23,0x6C,0x69,0x73,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4C,0x69,0x73,0x74,0x20,0x61,0x73,0x20,0x66,0x69,0x65,0x6C,0x64,0x3E,0x0A,0x09,0x09,0x09,0x09,0x3C,0x23,0x69,0x66,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x46,0x6F,0x6F,0x74,0x65,0x72,0x3F,0x65,0x78,0x69,0x73,0x74,0x73,0x29,0x20,0x26,0x26,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x46,0x6F,0x6F,0x74,0x65,0x72,0x3F,0x6C,0x65,0x6E,0x67,0x74,0x68,0x20,0x3E,0x20,0x30,0x29,0x3E,0x0A,0x09,0x09,0x09,0x09,0x09,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x46,0x6F,0x6F,0x74,0x65,0x72,0x7D,0x0A,0x09,0x09,0x09,0x09,0x3C,0x2F,0x23,0x69,0x66,0x3E,0x0A,0x09,0x09,0x09,0x09,0x3C,0x2F,0x23,0x6C,0x69,0x73,0x74,0x3E,0x0A,0x09,0x09,0x09,0x09,0x72,0x65,0x74,0x75,0x72,0x6E,0x3B,0x0A,0x09,0x09,0x09,0x3C,0x23,0x6C,0x69,0x73,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4C,0x69,0x73,0x74,0x20,0x61,0x73,0x20,0x66,0x69,0x65,0x6C,0x64,0x3E,0x0A,0x09,0x09,0x09,0x63,0x61,0x73,0x65,0x20,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x74,0x61,0x67,0x7D,0x3A,0x20,0x7B,0x0A,0x09,0x09,0x09,0x09,0x64,0x61,0x74,0x61,0x2E,0x70,0x75,0x74,0x53,0x65,0x72,0x69,0x61,0x6C,0x69,0x7A,0x61,0x74,0x69,0x6F,0x6E,0x46,0x69,0x65,0x6C,0x64,0x54,0x61,0x67,0x28,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x76,0x61,0x6C,0x75,0x65,0x7D,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x43,0x6F,0x64,0x65,0x7D,0x0A,0x09,0x09,0x09,0x09,0x62,0x72,0x65,0x61,0x6B,0x3B,0x0A,0x09,0x09,0x09,0x7D,0x0A,0x09,0x09,0x09,0x3C,0x2F,0x23,0x6C,0x69,0x73,0x74,0x3E,0x0A,0x09,0x09,0x09,0x09,0x0A,0x09,0x09,0x09,0x64,0x65,0x66,0x61,0x75,0x6C,0x74,0x3A,0x0A,0x09,0x09,0x09,0x09,0x64,0x61,0x74,0x61,0x2E,0x67,0x65,0x74,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x73,0x28,0x29,0x2E,0x70,0x61,0x72,0x73,0x65,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x28,0x74,0x61,0x67,0x2C,0x20,0x69,0x6E,0x70,0x75,0x74,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x62,0x72,0x65,0x61,0x6B,0x3B,0x0A,0x09,0x09,0x09,0x7D,0x0A,0x09,0x09,0x7D,0x0A,0x09,0x7D,0x0A,0x0A,0x09,0x40,0x4F,0x76,0x65,0x72,0x72,0x69,0x64,0x65,0x0A,0x09,0x70,0x75,0x62,0x6C,0x69,0x63,0x20,0x76,0x6F,0x69,0x64,0x20,0x77,0x72,0x69,0x74,0x65,0x50,0x62,0x54,0x6F,0x28,0x66,0x69,0x6E,0x61,0x6C,0x20,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x43,0x6F,0x72,0x65,0x49,0x6F,0x7D,0x2E,0x43,0x6F,0x64,0x65,0x64,0x4F,0x75,0x74,0x70,0x75,0x74,0x53,0x74,0x72,0x65,0x61,0x6D,0x20,0x6F,0x75,0x74,0x70,0x75,0x74,0x29,0x20,0x74,0x68,0x72,0x6F,0x77,0x73,0x20,0x49,0x4F,0x45,0x78,0x63,0x65,0x70,0x74,0x69,0x6F,0x6E,0x20,0x7B,0x0A,0x09,0x09,0x69,0x66,0x28,0x21,0x69,0x73,0x49,0x6E,0x69,0x74,0x69,0x61,0x6C,0x69,0x7A,0x65,0x64,0x28,0x29,0x29,0x7B,0x0A,0x09,0x09,0x09,0x74,0x68,0x72,0x6F,0x77,0x20,0x6E,0x65,0x77,0x20,0x52,0x75,0x6E,0x74,0x69,0x6D,0x65,0x45,0x78,0x63,0x65,0x70,0x74,0x69,0x6F,0x6E,0x28,0x22,0x72,0x65,0x71,0x75,0x69,0x72,0x65,0x64,0x20,0x66,0x69,0x65,0x6C,0x64,0x20,0x69,0x73,0x20,0x6E,0x75,0x6C,0x6C,0x2C,0x73,0x6F,0x20,0x73,0x74,0x6F,0x70,0x20,0x77,0x72,0x69,0x74,0x65,0x2E,0x22,0x29,0x3B,0x0A,0x09,0x09,0x7D,0x0A,0x09,0x09,0x67,0x65,0x74,0x53,0x65,0x72,0x69,0x61,0x6C,0x69,0x7A,0x65,0x64,0x53,0x69,0x7A,0x65,0x28,0x29,0x3B,0x0A,0x09,0x09,0x3C,0x23,0x6C,0x69,0x73,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4C,0x69,0x73,0x74,0x20,0x61,0x73,0x20,0x66,0x69,0x65,0x6C,0x64,0x3E,0x0A,0x09,0x09,0x09,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x77,0x72,0x69,0x74,0x65,0x43,0x6F,0x64,0x65,0x7D,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x6C,0x69,0x73,0x74,0x3E,0x0A,0x09,0x09,0x64,0x61,0x74,0x61,0x2E,0x67,0x65,0x74,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x73,0x28,0x29,0x2E,0x77,0x72,0x69,0x74,0x65,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x28,0x6F,0x75,0x74,0x70,0x75,0x74,0x29,0x3B,0x0A,0x09,0x7D,0x0A,0x0A,0x09,0x70,0x72,0x69,0x76,0x61,0x74,0x65,0x20,0x69,0x6E,0x74,0x20,0x6D,0x65,0x6D,0x6F,0x69,0x7A,0x65,0x64,0x53,0x65,0x72,0x69,0x61,0x6C,0x69,0x7A,0x65,0x64,0x53,0x69,0x7A,0x65,0x20,0x3D,0x20,0x2D,0x31,0x3B,0x0A,0x0A,0x09,0x40,0x4F,0x76,0x65,0x72,0x72,0x69,0x64,0x65,0x0A,0x09,0x70,0x75,0x62,0x6C,0x69,0x63,0x20,0x69,0x6E,0x74,0x20,0x67,0x65,0x74,0x53,0x65,0x72,0x69,0x61,0x6C,0x69,0x7A,0x65,0x64,0x53,0x69,0x7A,0x65,0x28,0x29,0x20,0x7B,0x0A,0x09,0x09,0x69,0x6E,0x74,0x20,0x73,0x69,0x7A,0x65,0x20,0x3D,0x20,0x6D,0x65,0x6D,0x6F,0x69,0x7A,0x65,0x64,0x53,0x65,0x72,0x69,0x61,0x6C,0x69,0x7A,0x65,0x64,0x53,0x69,0x7A,0x65,0x3B,0x0A,0x09,0x09,0x69,0x66,0x20,0x28,0x73,0x69,0x7A,0x65,0x20,0x21,0x3D,0x20,0x2D,0x31,0x29,0x0A,0x09,0x09,0x09,0x72,0x65,0x74,0x75,0x72,0x6E,0x20,0x73,0x69,0x7A,0x65,0x3B,0x0A,0x0A,0x09,0x09,0x73,0x69,0x7A,0x65,0x20,0x3D,0x20,0x30,0x3B,0x0A,0x09,0x09,0x0A,0x09,0x09,0x3C,0x23,0x6C,0x69,0x73,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4C,0x69,0x73,0x74,0x20,0x61,0x73,0x20,0x66,0x69,0x65,0x6C,0x64,0x3E,0x0A,0x09,0x09,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x73,0x69,0x7A,0x65,0x43,0x6F,0x64,0x65,0x7D,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x6C,0x69,0x73,0x74,0x3E,0x0A,0x09,0x09,0x0A,0x09,0x09,0x73,0x69,0x7A,0x65,0x20,0x2B,0x3D,0x20,0x64,0x61,0x74,0x61,0x2E,0x67,0x65,0x74,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x73,0x28,0x29,0x2E,0x67,0x65,0x74,0x53,0x65,0x72,0x69,0x61,0x6C,0x69,0x7A,0x65,0x64,0x53,0x69,0x7A,0x65,0x28,0x29,0x3B,0x0A,0x09,0x09,0x6D,0x65,0x6D,0x6F,0x69,0x7A,0x65,0x64,0x53,0x65,0x72,0x69,0x61,0x6C,0x69,0x7A,0x65,0x64,0x53,0x69,0x7A,0x65,0x20,0x3D,0x20,0x73,0x69,0x7A,0x65,0x3B,0x0A,0x09,0x09,0x72,0x65,0x74,0x75,0x72,0x6E,0x20,0x73,0x69,0x7A,0x65,0x3B,0x0A,0x09,0x7D,0x0A,0x09,0x0A,0x09,0x40,0x4F,0x76,0x65,0x72,0x72,0x69,0x64,0x65,0x0A,0x09,0x70,0x75,0x62,0x6C,0x69,0x63,0x20,0x63,0x6F,0x6D,0x2E,0x67,0x6F,0x6F,0x67,0x6C,0x65,0x2E,0x67,0x73,0x6F,0x6E,0x2E,0x4A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x20,0x74,0x6F,0x4A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x28,0x29,0x20,0x7B,0x0A,0x09,0x20,0x20,0x63,0x6F,0x6D,0x2E,0x67,0x6F,0x6F,0x67,0x6C,0x65,0x2E,0x67,0x73,0x6F,0x6E,0x2E,0x4A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x20,0x6A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x20,0x3D,0x20,0x6E,0x65,0x77,0x20,0x63,0x6F,0x6D,0x2E,0x67,0x6F,0x6F,0x67,0x6C,0x65,0x2E,0x67,0x73,0x6F,0x6E,0x2E,0x4A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x28,0x29,0x3B,0x0A,0x09,0x09,0x3C,0x23,0x6C,0x69,0x73,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4C,0x69,0x73,0x74,0x20,0x61,0x73,0x20,0x66,0x69,0x65,0x6C,0x64,0x3E,0x0A,0x09,0x09,0x09,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x6A,0x73,0x6F,0x6E,0x43,0x6F,0x64,0x65,0x7D,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x6C,0x69,0x73,0x74,0x3E,0x0A,0x09,0x09,0x69,0x66,0x20,0x28,0x74,0x68,0x69,0x73,0x2E,0x67,0x65,0x74,0x44,0x61,0x74,0x61,0x28,0x29,0x20,0x21,0x3D,0x20,0x6E,0x75,0x6C,0x6C,0x20,0x26,0x26,0x20,0x74,0x68,0x69,0x73,0x2E,0x67,0x65,0x74,0x44,0x61,0x74,0x61,0x28,0x29,0x2E,0x67,0x65,0x74,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x73,0x28,0x29,0x20,0x21,0x3D,0x20,0x6E,0x75,0x6C,0x6C,0x20,0x26,0x26,0x20,0x74,0x68,0x69,0x73,0x2E,0x67,0x65,0x74,0x44,0x61,0x74,0x61,0x28,0x29,0x2E,0x67,0x65,0x74,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x73,0x28,0x29,0x2E,0x67,0x65,0x74,0x4E,0x75,0x6D,0x62,0x65,0x72,0x73,0x28,0x29,0x20,0x21,0x3D,0x20,0x6E,0x75,0x6C,0x6C,0x29,0x20,0x7B,0x0A,0x09,0x09,0x09,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x43,0x6F,0x72,0x65,0x52,0x6F,0x6F,0x74,0x7D,0x2E,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x53,0x65,0x74,0x20,0x75,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x73,0x20,0x3D,0x20,0x74,0x68,0x69,0x73,0x2E,0x67,0x65,0x74,0x44,0x61,0x74,0x61,0x28,0x29,0x2E,0x67,0x65,0x74,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x73,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x6A,0x61,0x76,0x61,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x49,0x74,0x65,0x72,0x61,0x74,0x6F,0x72,0x3C,0x49,0x6E,0x74,0x65,0x67,0x65,0x72,0x3E,0x20,0x6E,0x75,0x6D,0x62,0x65,0x72,0x73,0x20,0x3D,0x20,0x75,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x73,0x2E,0x67,0x65,0x74,0x4E,0x75,0x6D,0x62,0x65,0x72,0x73,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x63,0x6F,0x6D,0x2E,0x67,0x6F,0x6F,0x67,0x6C,0x65,0x2E,0x67,0x73,0x6F,0x6E,0x2E,0x4A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x20,0x75,0x6E,0x6B,0x6E,0x6F,0x77,0x46,0x69,0x65,0x6C,0x64,0x4A,0x73,0x6F,0x6E,0x20,0x3D,0x20,0x6E,0x65,0x77,0x20,0x63,0x6F,0x6D,0x2E,0x67,0x6F,0x6F,0x67,0x6C,0x65,0x2E,0x67,0x73,0x6F,0x6E,0x2E,0x4A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x77,0x68,0x69,0x6C,0x65,0x20,0x28,0x6E,0x75,0x6D,0x62,0x65,0x72,0x73,0x2E,0x68,0x61,0x73,0x4E,0x65,0x78,0x74,0x28,0x29,0x29,0x20,0x7B,0x0A,0x09,0x09,0x09,0x09,0x63,0x6F,0x6D,0x2E,0x67,0x6F,0x6F,0x67,0x6C,0x65,0x2E,0x67,0x73,0x6F,0x6E,0x2E,0x4A,0x73,0x6F,0x6E,0x41,0x72,0x72,0x61,0x79,0x20,0x75,0x6E,0x6B,0x6E,0x6F,0x77,0x46,0x69,0x65,0x6C,0x64,0x56,0x61,0x6C,0x75,0x65,0x4A,0x73,0x6F,0x6E,0x20,0x3D,0x20,0x6E,0x65,0x77,0x20,0x63,0x6F,0x6D,0x2E,0x67,0x6F,0x6F,0x67,0x6C,0x65,0x2E,0x67,0x73,0x6F,0x6E,0x2E,0x4A,0x73,0x6F,0x6E,0x41,0x72,0x72,0x61,0x79,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x49,0x6E,0x74,0x65,0x67,0x65,0x72,0x20,0x6E,0x75,0x6D,0x62,0x65,0x72,0x20,0x3D,0x20,0x6E,0x75,0x6D,0x62,0x65,0x72,0x73,0x2E,0x6E,0x65,0x78,0x74,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x6A,0x61,0x76,0x61,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x49,0x74,0x65,0x72,0x61,0x74,0x6F,0x72,0x3C,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x43,0x6F,0x72,0x65,0x52,0x6F,0x6F,0x74,0x7D,0x2E,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x3C,0x3F,0x3E,0x3E,0x20,0x66,0x69,0x65,0x6C,0x64,0x73,0x20,0x3D,0x20,0x75,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x73,0x2E,0x67,0x65,0x74,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x46,0x69,0x65,0x6C,0x64,0x73,0x28,0x6E,0x75,0x6D,0x62,0x65,0x72,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x69,0x66,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x73,0x20,0x3D,0x3D,0x20,0x6E,0x75,0x6C,0x6C,0x29,0x20,0x7B,0x0A,0x09,0x09,0x09,0x09,0x09,0x63,0x6F,0x6E,0x74,0x69,0x6E,0x75,0x65,0x3B,0x0A,0x09,0x09,0x09,0x09,0x7D,0x0A,0x09,0x09,0x09,0x09,0x77,0x68,0x69,0x6C,0x65,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x73,0x2E,0x68,0x61,0x73,0x4E,0x65,0x78,0x74,0x28,0x29,0x29,0x20,0x7B,0x0A,0x09,0x09,0x09,0x09,0x09,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x43,0x6F,0x72,0x65,0x52,0x6F,0x6F,0x74,0x7D,0x2E,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x3C,0x3F,0x3E,0x20,0x66,0x69,0x65,0x6C,0x64,0x20,0x3D,0x20,0x66,0x69,0x65,0x6C,0x64,0x73,0x2E,0x6E,0x65,0x78,0x74,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x09,0x63,0x6F,0x6D,0x2E,0x67,0x6F,0x6F,0x67,0x6C,0x65,0x2E,0x67,0x73,0x6F,0x6E,0x2E,0x4A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4A,0x73,0x6F,0x6E,0x20,0x3D,0x20,0x6E,0x65,0x77,0x20,0x63,0x6F,0x6D,0x2E,0x67,0x6F,0x6F,0x67,0x6C,0x65,0x2E,0x67,0x73,0x6F,0x6E,0x2E,0x4A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x09,0x66,0x69,0x65,0x6C,0x64,0x4A,0x73,0x6F,0x6E,0x2E,0x61,0x64,0x64,0x50,0x72,0x6F,0x70,0x65,0x72,0x74,0x79,0x28,0x22,0x74,0x22,0x2C,0x20,0x66,0x69,0x65,0x6C,0x64,0x2E,0x67,0x65,0x74,0x44,0x61,0x74,0x61,0x28,0x29,0x2E,0x74,0x6F,0x53,0x74,0x72,0x69,0x6E,0x67,0x28,0x29,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x09,0x66,0x69,0x65,0x6C,0x64,0x4A,0x73,0x6F,0x6E,0x2E,0x61,0x64,0x64,0x50,0x72,0x6F,0x70,0x65,0x72,0x74,0x79,0x28,0x22,0x77,0x69,0x72,0x65,0x46,0x6F,0x72,0x6D,0x61,0x74,0x22,0x2C,0x20,0x66,0x69,0x65,0x6C,0x64,0x2E,0x67,0x65,0x74,0x57,0x69,0x72,0x65,0x46,0x6F,0x72,0x6D,0x61,0x74,0x28,0x29,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x09,0x75,0x6E,0x6B,0x6E,0x6F,0x77,0x46,0x69,0x65,0x6C,0x64,0x56,0x61,0x6C,0x75,0x65,0x4A,0x73,0x6F,0x6E,0x2E,0x61,0x64,0x64,0x28,0x66,0x69,0x65,0x6C,0x64,0x4A,0x73,0x6F,0x6E,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x7D,0x0A,0x09,0x09,0x09,0x09,0x75,0x6E,0x6B,0x6E,0x6F,0x77,0x46,0x69,0x65,0x6C,0x64,0x4A,0x73,0x6F,0x6E,0x2E,0x61,0x64,0x64,0x28,0x53,0x74,0x72,0x69,0x6E,0x67,0x2E,0x76,0x61,0x6C,0x75,0x65,0x4F,0x66,0x28,0x6E,0x75,0x6D,0x62,0x65,0x72,0x29,0x2C,0x20,0x75,0x6E,0x6B,0x6E,0x6F,0x77,0x46,0x69,0x65,0x6C,0x64,0x56,0x61,0x6C,0x75,0x65,0x4A,0x73,0x6F,0x6E,0x29,0x3B,0x0A,0x09,0x09,0x09,0x7D,0x0A,0x09,0x09,0x09,0x63,0x6F,0x6D,0x2E,0x67,0x6F,0x6F,0x67,0x6C,0x65,0x2E,0x67,0x73,0x6F,0x6E,0x2E,0x4A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4D,0x61,0x70,0x4A,0x73,0x6F,0x6E,0x20,0x3D,0x20,0x6E,0x65,0x77,0x20,0x63,0x6F,0x6D,0x2E,0x67,0x6F,0x6F,0x67,0x6C,0x65,0x2E,0x67,0x73,0x6F,0x6E,0x2E,0x4A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x66,0x69,0x65,0x6C,0x64,0x4D,0x61,0x70,0x4A,0x73,0x6F,0x6E,0x2E,0x61,0x64,0x64,0x28,0x22,0x66,0x69,0x65,0x6C,0x64,0x4D,0x61,0x70,0x22,0x2C,0x20,0x75,0x6E,0x6B,0x6E,0x6F,0x77,0x46,0x69,0x65,0x6C,0x64,0x4A,0x73,0x6F,0x6E,0x29,0x3B,0x0A,0x09,0x09,0x09,0x6A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x2E,0x61,0x64,0x64,0x28,0x22,0x75,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x53,0x65,0x74,0x22,0x2C,0x20,0x66,0x69,0x65,0x6C,0x64,0x4D,0x61,0x70,0x4A,0x73,0x6F,0x6E,0x29,0x3B,0x0A,0x09,0x09,0x7D,0x0A,0x09,0x09,0x72,0x65,0x74,0x75,0x72,0x6E,0x20,0x6A,0x73,0x6F,0x6E,0x4F,0x62,0x6A,0x65,0x63,0x74,0x3B,0x0A,0x09,0x7D,0x0A,0x0A,0x0A,0x09,0x40,0x4F,0x76,0x65,0x72,0x72,0x69,0x64,0x65,0x0A,0x09,0x70,0x75,0x62,0x6C,0x69,0x63,0x20,0x76,0x6F,0x69,0x64,0x20,0x70,0x61,0x72,0x73,0x65,0x4A,0x73,0x6F,0x6E,0x46,0x72,0x6F,0x6D,0x28,0x66,0x69,0x6E,0x61,0x6C,0x20,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x43,0x6F,0x72,0x65,0x49,0x6F,0x7D,0x2E,0x4A,0x73,0x6F,0x6E,0x49,0x6E,0x70,0x75,0x74,0x53,0x74,0x72,0x65,0x61,0x6D,0x20,0x69,0x6E,0x70,0x75,0x74,0x29,0x20,0x7B,0x0A,0x09,0x09,0x74,0x68,0x69,0x73,0x2E,0x64,0x61,0x74,0x61,0x20,0x3D,0x20,0x69,0x6E,0x70,0x75,0x74,0x2E,0x72,0x65,0x61,0x64,0x28,0x74,0x68,0x69,0x73,0x2E,0x67,0x65,0x74,0x44,0x61,0x74,0x61,0x28,0x29,0x2E,0x67,0x65,0x74,0x43,0x6C,0x61,0x73,0x73,0x28,0x29,0x29,0x3B,0x0A,0x09,0x7D,0x0A,0x0A,0x09,0x70,0x75,0x62,0x6C,0x69,0x63,0x20,0x62,0x6F,0x6F,0x6C,0x65,0x61,0x6E,0x20,0x69,0x73,0x49,0x6E,0x69,0x74,0x69,0x61,0x6C,0x69,0x7A,0x65,0x64,0x28,0x29,0x7B,0x0A,0x09,0x09,0x3C,0x23,0x6C,0x69,0x73,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4C,0x69,0x73,0x74,0x20,0x61,0x73,0x20,0x66,0x69,0x65,0x6C,0x64,0x3E,0x0A,0x09,0x09,0x3C,0x23,0x69,0x66,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x72,0x65,0x71,0x75,0x69,0x72,0x65,0x64,0x43,0x6F,0x64,0x65,0x3F,0x65,0x78,0x69,0x73,0x74,0x73,0x29,0x20,0x26,0x26,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x72,0x65,0x71,0x75,0x69,0x72,0x65,0x64,0x43,0x6F,0x64,0x65,0x3F,0x6C,0x65,0x6E,0x67,0x74,0x68,0x20,0x3E,0x30,0x29,0x3E,0x0A,0x09,0x09,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x72,0x65,0x71,0x75,0x69,0x72,0x65,0x64,0x43,0x6F,0x64,0x65,0x7D,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x69,0x66,0x3E,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x6C,0x69,0x73,0x74,0x3E,0x0A,0x09,0x09,0x72,0x65,0x74,0x75,0x72,0x6E,0x20,0x74,0x72,0x75,0x65,0x3B,0x0A,0x09,0x7D,0x0A,0x0A,0x09,0x40,0x4F,0x76,0x65,0x72,0x72,0x69,0x64,0x65,0x0A,0x09,0x70,0x75,0x62,0x6C,0x69,0x63,0x20,0x76,0x6F,0x69,0x64,0x20,0x77,0x72,0x69,0x74,0x65,0x58,0x6D,0x6C,0x54,0x6F,0x28,0x66,0x69,0x6E,0x61,0x6C,0x20,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x43,0x6F,0x72,0x65,0x49,0x6F,0x7D,0x2E,0x58,0x6D,0x6C,0x4F,0x75,0x74,0x70,0x75,0x74,0x53,0x74,0x72,0x65,0x61,0x6D,0x20,0x6F,0x75,0x74,0x70,0x75,0x74,0x29,0x20,0x74,0x68,0x72,0x6F,0x77,0x73,0x20,0x58,0x4D,0x4C,0x53,0x74,0x72,0x65,0x61,0x6D,0x45,0x78,0x63,0x65,0x70,0x74,0x69,0x6F,0x6E,0x7B,0x0A,0x09,0x09,0x6F,0x75,0x74,0x70,0x75,0x74,0x2E,0x77,0x72,0x69,0x74,0x65,0x53,0x74,0x61,0x72,0x74,0x52,0x6F,0x6F,0x74,0x28,0x22,0x24,0x7B,0x78,0x6D,0x6C,0x52,0x6F,0x6F,0x74,0x7D,0x22,0x29,0x3B,0x0A,0x09,0x09,0x3C,0x23,0x6C,0x69,0x73,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4C,0x69,0x73,0x74,0x20,0x61,0x73,0x20,0x66,0x69,0x65,0x6C,0x64,0x3E,0x0A,0x09,0x09,0x3C,0x23,0x69,0x66,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x77,0x72,0x69,0x74,0x65,0x41,0x74,0x74,0x72,0x58,0x6D,0x6C,0x43,0x6F,0x64,0x65,0x3F,0x65,0x78,0x69,0x73,0x74,0x73,0x29,0x20,0x26,0x26,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x77,0x72,0x69,0x74,0x65,0x41,0x74,0x74,0x72,0x58,0x6D,0x6C,0x43,0x6F,0x64,0x65,0x3F,0x6C,0x65,0x6E,0x67,0x74,0x68,0x20,0x3E,0x30,0x29,0x3E,0x0A,0x09,0x09,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x77,0x72,0x69,0x74,0x65,0x41,0x74,0x74,0x72,0x58,0x6D,0x6C,0x43,0x6F,0x64,0x65,0x7D,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x69,0x66,0x3E,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x6C,0x69,0x73,0x74,0x3E,0x0A,0x09,0x09,0x3C,0x23,0x6C,0x69,0x73,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4C,0x69,0x73,0x74,0x20,0x61,0x73,0x20,0x66,0x69,0x65,0x6C,0x64,0x3E,0x0A,0x09,0x09,0x3C,0x23,0x69,0x66,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x77,0x72,0x69,0x74,0x65,0x4E,0x6F,0x64,0x65,0x58,0x6D,0x6C,0x43,0x6F,0x64,0x65,0x3F,0x65,0x78,0x69,0x73,0x74,0x73,0x29,0x20,0x26,0x26,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x77,0x72,0x69,0x74,0x65,0x4E,0x6F,0x64,0x65,0x58,0x6D,0x6C,0x43,0x6F,0x64,0x65,0x3F,0x6C,0x65,0x6E,0x67,0x74,0x68,0x20,0x3E,0x30,0x29,0x3E,0x0A,0x09,0x09,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x77,0x72,0x69,0x74,0x65,0x4E,0x6F,0x64,0x65,0x58,0x6D,0x6C,0x43,0x6F,0x64,0x65,0x7D,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x69,0x66,0x3E,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x6C,0x69,0x73,0x74,0x3E,0x0A,0x09,0x09,0x53,0x74,0x72,0x69,0x6E,0x67,0x20,0x61,0x6E,0x79,0x53,0x74,0x72,0x69,0x6E,0x67,0x20,0x3D,0x20,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x43,0x6F,0x72,0x65,0x52,0x6F,0x6F,0x74,0x7D,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x53,0x75,0x70,0x65,0x72,0x50,0x6F,0x6A,0x6F,0x55,0x74,0x69,0x6C,0x73,0x2E,0x67,0x65,0x74,0x53,0x74,0x72,0x69,0x6E,0x67,0x41,0x6E,0x79,0x4E,0x6F,0x64,0x65,0x28,0x64,0x61,0x74,0x61,0x29,0x3B,0x0A,0x09,0x09,0x69,0x66,0x28,0x61,0x6E,0x79,0x53,0x74,0x72,0x69,0x6E,0x67,0x20,0x21,0x3D,0x20,0x6E,0x75,0x6C,0x6C,0x29,0x20,0x7B,0x20,0x6F,0x75,0x74,0x70,0x75,0x74,0x2E,0x77,0x72,0x69,0x74,0x65,0x28,0x61,0x6E,0x79,0x53,0x74,0x72,0x69,0x6E,0x67,0x29,0x3B,0x20,0x7D,0x0A,0x09,0x09,0x69,0x66,0x28,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x43,0x6F,0x72,0x65,0x52,0x6F,0x6F,0x74,0x7D,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x53,0x75,0x70,0x65,0x72,0x50,0x6F,0x6A,0x6F,0x55,0x74,0x69,0x6C,0x73,0x2E,0x67,0x65,0x74,0x41,0x6E,0x79,0x4E,0x6F,0x64,0x65,0x28,0x64,0x61,0x74,0x61,0x29,0x20,0x21,0x3D,0x20,0x6E,0x75,0x6C,0x6C,0x29,0x20,0x7B,0x0A,0x09,0x09,0x09,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x43,0x6F,0x72,0x65,0x52,0x6F,0x6F,0x74,0x7D,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x53,0x75,0x70,0x65,0x72,0x50,0x6F,0x6A,0x6F,0x55,0x74,0x69,0x6C,0x73,0x2E,0x67,0x65,0x74,0x41,0x6E,0x79,0x4E,0x6F,0x64,0x65,0x28,0x64,0x61,0x74,0x61,0x29,0x2E,0x74,0x6F,0x58,0x6D,0x6C,0x42,0x79,0x74,0x65,0x41,0x72,0x72,0x61,0x79,0x28,0x6F,0x75,0x74,0x70,0x75,0x74,0x29,0x3B,0x0A,0x09,0x09,0x7D,0x0A,0x09,0x7D,0x0A,0x0A,0x09,0x40,0x4F,0x76,0x65,0x72,0x72,0x69,0x64,0x65,0x0A,0x09,0x70,0x75,0x62,0x6C,0x69,0x63,0x20,0x76,0x6F,0x69,0x64,0x20,0x70,0x61,0x72,0x73,0x65,0x58,0x6D,0x6C,0x46,0x72,0x6F,0x6D,0x28,0x66,0x69,0x6E,0x61,0x6C,0x20,0x24,0x7B,0x70,0x61,0x63,0x6B,0x61,0x67,0x65,0x43,0x6F,0x72,0x65,0x49,0x6F,0x7D,0x2E,0x58,0x6D,0x6C,0x49,0x6E,0x70,0x75,0x74,0x53,0x74,0x72,0x65,0x61,0x6D,0x20,0x69,0x6E,0x70,0x75,0x74,0x29,0x20,0x74,0x68,0x72,0x6F,0x77,0x73,0x20,0x58,0x4D,0x4C,0x53,0x74,0x72,0x65,0x61,0x6D,0x45,0x78,0x63,0x65,0x70,0x74,0x69,0x6F,0x6E,0x7B,0x0A,0x09,0x09,0x3C,0x23,0x69,0x66,0x20,0x70,0x61,0x72,0x73,0x65,0x46,0x6F,0x6F,0x74,0x65,0x72,0x45,0x78,0x69,0x73,0x74,0x73,0x20,0x3E,0x0A,0x09,0x09,0x6A,0x61,0x76,0x61,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x4D,0x61,0x70,0x3C,0x49,0x6E,0x74,0x65,0x67,0x65,0x72,0x2C,0x6A,0x61,0x76,0x61,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x4C,0x69,0x73,0x74,0x3C,0x3F,0x3E,0x3E,0x20,0x61,0x72,0x72,0x61,0x79,0x54,0x79,0x70,0x65,0x74,0x4D,0x61,0x70,0x20,0x3D,0x20,0x6E,0x65,0x77,0x20,0x6A,0x61,0x76,0x61,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x48,0x61,0x73,0x68,0x4D,0x61,0x70,0x3C,0x6A,0x61,0x76,0x61,0x2E,0x6C,0x61,0x6E,0x67,0x2E,0x49,0x6E,0x74,0x65,0x67,0x65,0x72,0x2C,0x20,0x6A,0x61,0x76,0x61,0x2E,0x75,0x74,0x69,0x6C,0x2E,0x4C,0x69,0x73,0x74,0x3C,0x3F,0x3E,0x3E,0x28,0x29,0x3B,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x69,0x66,0x3E,0x0A,0x09,0x09,0x53,0x74,0x72,0x69,0x6E,0x67,0x20,0x70,0x61,0x72,0x65,0x6E,0x74,0x4E,0x61,0x6D,0x65,0x20,0x3D,0x20,0x22,0x22,0x3B,0x0A,0x09,0x09,0x69,0x6E,0x70,0x75,0x74,0x2E,0x6D,0x6F,0x76,0x65,0x53,0x74,0x61,0x72,0x74,0x52,0x6F,0x6F,0x74,0x28,0x22,0x24,0x7B,0x78,0x6D,0x6C,0x52,0x6F,0x6F,0x74,0x7D,0x22,0x29,0x3B,0x0A,0x09,0x09,0x69,0x6E,0x74,0x20,0x73,0x65,0x71,0x20,0x3D,0x20,0x69,0x6E,0x70,0x75,0x74,0x2E,0x67,0x65,0x74,0x43,0x75,0x72,0x72,0x65,0x6E,0x74,0x53,0x65,0x71,0x28,0x29,0x3B,0x0A,0x09,0x09,0x77,0x68,0x69,0x6C,0x65,0x20,0x28,0x69,0x6E,0x70,0x75,0x74,0x2E,0x68,0x61,0x73,0x41,0x74,0x74,0x72,0x69,0x62,0x75,0x74,0x65,0x4E,0x65,0x78,0x74,0x28,0x29,0x29,0x20,0x7B,0x0A,0x09,0x09,0x09,0x69,0x6E,0x70,0x75,0x74,0x2E,0x6E,0x65,0x78,0x74,0x41,0x74,0x74,0x72,0x69,0x62,0x75,0x74,0x65,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x53,0x74,0x72,0x69,0x6E,0x67,0x20,0x6E,0x61,0x6D,0x65,0x20,0x3D,0x20,0x69,0x6E,0x70,0x75,0x74,0x2E,0x72,0x65,0x61,0x64,0x4E,0x61,0x6D,0x65,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x69,0x66,0x28,0x6E,0x61,0x6D,0x65,0x3D,0x3D,0x6E,0x75,0x6C,0x6C,0x29,0x7B,0x0A,0x09,0x09,0x09,0x09,0x62,0x72,0x65,0x61,0x6B,0x3B,0x0A,0x09,0x09,0x09,0x7D,0x0A,0x09,0x09,0x09,0x3C,0x23,0x6C,0x69,0x73,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4C,0x69,0x73,0x74,0x20,0x61,0x73,0x20,0x66,0x69,0x65,0x6C,0x64,0x3E,0x0A,0x09,0x09,0x09,0x3C,0x23,0x69,0x66,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x41,0x74,0x74,0x72,0x58,0x6D,0x6C,0x43,0x6F,0x64,0x65,0x3F,0x65,0x78,0x69,0x73,0x74,0x73,0x29,0x20,0x26,0x26,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x41,0x74,0x74,0x72,0x58,0x6D,0x6C,0x43,0x6F,0x64,0x65,0x3F,0x6C,0x65,0x6E,0x67,0x74,0x68,0x20,0x3E,0x20,0x30,0x29,0x3E,0x0A,0x09,0x09,0x09,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x41,0x74,0x74,0x72,0x58,0x6D,0x6C,0x43,0x6F,0x64,0x65,0x7D,0x0A,0x09,0x09,0x09,0x3C,0x2F,0x23,0x69,0x66,0x3E,0x0A,0x09,0x09,0x09,0x3C,0x2F,0x23,0x6C,0x69,0x73,0x74,0x3E,0x0A,0x09,0x09,0x09,0x65,0x6C,0x73,0x65,0x20,0x7B,0x0A,0x09,0x09,0x09,0x09,0x2F,0x2F,0x20,0x54,0x4F,0x44,0x4F,0x20,0x6E,0x65,0x65,0x64,0x20,0x73,0x61,0x76,0x65,0x0A,0x09,0x09,0x09,0x09,0x53,0x74,0x72,0x69,0x6E,0x67,0x20,0x76,0x61,0x6C,0x75,0x65,0x20,0x3D,0x20,0x69,0x6E,0x70,0x75,0x74,0x2E,0x72,0x65,0x61,0x64,0x53,0x74,0x72,0x69,0x6E,0x67,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x53,0x79,0x73,0x74,0x65,0x6D,0x2E,0x65,0x72,0x72,0x2E,0x70,0x72,0x69,0x6E,0x74,0x6C,0x6E,0x28,0x53,0x74,0x72,0x69,0x6E,0x67,0x2E,0x66,0x6F,0x72,0x6D,0x61,0x74,0x28,0x22,0x4E,0x6F,0x74,0x20,0x66,0x6F,0x75,0x6E,0x64,0x20,0x5B,0x25,0x73,0x5D,0x20,0x61,0x74,0x74,0x72,0x69,0x62,0x75,0x74,0x65,0x2E,0x73,0x6B,0x69,0x70,0x20,0x76,0x61,0x6C,0x75,0x65,0x20,0x5B,0x25,0x73,0x5D,0x22,0x2C,0x6E,0x61,0x6D,0x65,0x2C,0x76,0x61,0x6C,0x75,0x65,0x29,0x29,0x3B,0x0A,0x09,0x09,0x09,0x7D,0x0A,0x09,0x09,0x7D,0x0A,0x09,0x09,0x77,0x68,0x69,0x6C,0x65,0x20,0x28,0x69,0x6E,0x70,0x75,0x74,0x2E,0x68,0x61,0x73,0x4E,0x6F,0x64,0x65,0x4E,0x65,0x78,0x74,0x28,0x29,0x29,0x20,0x7B,0x0A,0x09,0x09,0x09,0x69,0x6E,0x70,0x75,0x74,0x2E,0x6E,0x65,0x78,0x74,0x45,0x76,0x65,0x6E,0x74,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x69,0x66,0x20,0x28,0x69,0x6E,0x70,0x75,0x74,0x2E,0x67,0x65,0x74,0x43,0x75,0x72,0x72,0x65,0x6E,0x74,0x45,0x76,0x65,0x6E,0x74,0x28,0x29,0x2E,0x69,0x73,0x43,0x68,0x61,0x72,0x61,0x63,0x74,0x65,0x72,0x73,0x28,0x29,0x29,0x20,0x7B,0x0A,0x09,0x09,0x09,0x09,0x53,0x74,0x72,0x69,0x6E,0x67,0x20,0x76,0x61,0x6C,0x75,0x65,0x20,0x3D,0x20,0x69,0x6E,0x70,0x75,0x74,0x2E,0x67,0x65,0x74,0x43,0x75,0x72,0x72,0x65,0x6E,0x74,0x45,0x76,0x65,0x6E,0x74,0x28,0x29,0x2E,0x61,0x73,0x43,0x68,0x61,0x72,0x61,0x63,0x74,0x65,0x72,0x73,0x28,0x29,0x2E,0x67,0x65,0x74,0x44,0x61,0x74,0x61,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x64,0x61,0x74,0x61,0x2E,0x67,0x65,0x74,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x73,0x28,0x29,0x2E,0x70,0x75,0x74,0x53,0x74,0x72,0x69,0x6E,0x67,0x41,0x6E,0x79,0x4E,0x6F,0x64,0x65,0x28,0x76,0x61,0x6C,0x75,0x65,0x29,0x3B,0x0A,0x09,0x09,0x09,0x7D,0x0A,0x09,0x09,0x09,0x53,0x74,0x72,0x69,0x6E,0x67,0x20,0x6E,0x61,0x6D,0x65,0x20,0x3D,0x20,0x69,0x6E,0x70,0x75,0x74,0x2E,0x72,0x65,0x61,0x64,0x4E,0x61,0x6D,0x65,0x28,0x73,0x65,0x71,0x29,0x3B,0x0A,0x09,0x09,0x09,0x69,0x66,0x28,0x6E,0x61,0x6D,0x65,0x3D,0x3D,0x6E,0x75,0x6C,0x6C,0x29,0x7B,0x0A,0x09,0x09,0x09,0x09,0x62,0x72,0x65,0x61,0x6B,0x3B,0x0A,0x09,0x09,0x09,0x7D,0x0A,0x09,0x09,0x09,0x3C,0x23,0x6C,0x69,0x73,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4C,0x69,0x73,0x74,0x20,0x61,0x73,0x20,0x66,0x69,0x65,0x6C,0x64,0x3E,0x0A,0x09,0x09,0x09,0x3C,0x23,0x69,0x66,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x4E,0x6F,0x64,0x65,0x58,0x6D,0x6C,0x43,0x6F,0x64,0x65,0x3F,0x65,0x78,0x69,0x73,0x74,0x73,0x29,0x20,0x26,0x26,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x4E,0x6F,0x64,0x65,0x58,0x6D,0x6C,0x43,0x6F,0x64,0x65,0x3F,0x6C,0x65,0x6E,0x67,0x74,0x68,0x20,0x3E,0x20,0x30,0x29,0x3E,0x0A,0x09,0x09,0x09,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x4E,0x6F,0x64,0x65,0x58,0x6D,0x6C,0x43,0x6F,0x64,0x65,0x7D,0x0A,0x09,0x09,0x09,0x3C,0x2F,0x23,0x69,0x66,0x3E,0x0A,0x09,0x09,0x09,0x3C,0x2F,0x23,0x6C,0x69,0x73,0x74,0x3E,0x0A,0x09,0x09,0x09,0x65,0x6C,0x73,0x65,0x20,0x7B,0x0A,0x09,0x09,0x09,0x09,0x2F,0x2F,0x20,0x54,0x4F,0x44,0x4F,0x20,0x6E,0x65,0x65,0x64,0x20,0x73,0x61,0x76,0x65,0x0A,0x09,0x09,0x09,0x09,0x2F,0x2F,0x53,0x74,0x72,0x69,0x6E,0x67,0x20,0x76,0x61,0x6C,0x75,0x65,0x20,0x3D,0x20,0x69,0x6E,0x70,0x75,0x74,0x2E,0x72,0x65,0x61,0x64,0x53,0x74,0x72,0x69,0x6E,0x67,0x28,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x64,0x61,0x74,0x61,0x2E,0x67,0x65,0x74,0x55,0x6E,0x6B,0x6E,0x6F,0x77,0x6E,0x46,0x69,0x65,0x6C,0x64,0x73,0x28,0x29,0x2E,0x70,0x61,0x72,0x73,0x65,0x41,0x6E,0x79,0x4E,0x6F,0x64,0x65,0x28,0x6E,0x61,0x6D,0x65,0x2C,0x20,0x69,0x6E,0x70,0x75,0x74,0x29,0x3B,0x0A,0x09,0x09,0x09,0x09,0x53,0x79,0x73,0x74,0x65,0x6D,0x2E,0x65,0x72,0x72,0x2E,0x70,0x72,0x69,0x6E,0x74,0x6C,0x6E,0x28,0x53,0x74,0x72,0x69,0x6E,0x67,0x2E,0x66,0x6F,0x72,0x6D,0x61,0x74,0x28,0x22,0x4E,0x6F,0x74,0x20,0x66,0x6F,0x75,0x6E,0x64,0x20,0x5B,0x25,0x73,0x5D,0x20,0x6E,0x6F,0x64,0x65,0x2E,0x22,0x2C,0x6E,0x61,0x6D,0x65,0x29,0x29,0x3B,0x0A,0x09,0x09,0x09,0x7D,0x0A,0x09,0x09,0x7D,0x0A,0x09,0x09,0x0A,0x09,0x09,0x3C,0x23,0x6C,0x69,0x73,0x74,0x20,0x66,0x69,0x65,0x6C,0x64,0x4C,0x69,0x73,0x74,0x20,0x61,0x73,0x20,0x66,0x69,0x65,0x6C,0x64,0x3E,0x0A,0x09,0x09,0x3C,0x23,0x69,0x66,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x46,0x6F,0x6F,0x74,0x65,0x72,0x3F,0x65,0x78,0x69,0x73,0x74,0x73,0x29,0x20,0x26,0x26,0x20,0x28,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x46,0x6F,0x6F,0x74,0x65,0x72,0x3F,0x6C,0x65,0x6E,0x67,0x74,0x68,0x20,0x3E,0x20,0x30,0x29,0x3E,0x0A,0x09,0x09,0x24,0x7B,0x66,0x69,0x65,0x6C,0x64,0x2E,0x70,0x61,0x72,0x73,0x65,0x46,0x6F,0x6F,0x74,0x65,0x72,0x7D,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x69,0x66,0x3E,0x0A,0x09,0x09,0x3C,0x2F,0x23,0x6C,0x69,0x73,0x74,0x3E,0x0A,0x09,0x7D,0x0A,0x7D});

    /**
     * 这个是自动生成SuperPojoBuilderFactory时使用的模板
     */
    public static final String PROTO_BUILDER_FACTORY_TEMPLATE = new String(new byte[]{0x70, 0x61, 0x63, 0x6B, 0x61,
            0x67, 0x65, 0x20, 0x24, 0x7B, 0x70, 0x61, 0x63, 0x6B, 0x61, 0x67, 0x65, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x3B,
            0x0A, 0x0A, 0x70, 0x75, 0x62, 0x6C, 0x69, 0x63, 0x20, 0x63, 0x6C, 0x61, 0x73, 0x73, 0x20, 0x24, 0x7B, 0x62,
            0x75, 0x69, 0x6C, 0x64, 0x65, 0x72, 0x46, 0x61, 0x63, 0x74, 0x6F, 0x72, 0x79, 0x43, 0x6C, 0x61, 0x73, 0x73,
            0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x20, 0x69, 0x6D, 0x70, 0x6C, 0x65, 0x6D, 0x65, 0x6E, 0x74, 0x73, 0x20, 0x24,
            0x7B, 0x70, 0x61, 0x63, 0x6B, 0x61, 0x67, 0x65, 0x43, 0x6F, 0x72, 0x65, 0x52, 0x6F, 0x6F, 0x74, 0x7D, 0x2E,
            0x42, 0x75, 0x69, 0x6C, 0x64, 0x65, 0x72, 0x46, 0x61, 0x63, 0x74, 0x6F, 0x72, 0x79, 0x20, 0x7B, 0x0A, 0x0A,
            0x09, 0x40, 0x53, 0x75, 0x70, 0x70, 0x72, 0x65, 0x73, 0x73, 0x57, 0x61, 0x72, 0x6E, 0x69, 0x6E, 0x67, 0x73,
            0x28, 0x22, 0x75, 0x6E, 0x63, 0x68, 0x65, 0x63, 0x6B, 0x65, 0x64, 0x22, 0x29, 0x0A, 0x09, 0x40, 0x4F, 0x76,
            0x65, 0x72, 0x72, 0x69, 0x64, 0x65, 0x0A, 0x09, 0x70, 0x75, 0x62, 0x6C, 0x69, 0x63, 0x20, 0x3C, 0x54, 0x20,
            0x65, 0x78, 0x74, 0x65, 0x6E, 0x64, 0x73, 0x20, 0x4F, 0x62, 0x6A, 0x65, 0x63, 0x74, 0x3E, 0x20, 0x24, 0x7B,
            0x70, 0x61, 0x63, 0x6B, 0x61, 0x67, 0x65, 0x43, 0x6F, 0x72, 0x65, 0x52, 0x6F, 0x6F, 0x74, 0x7D, 0x2E, 0x42,
            0x75, 0x69, 0x6C, 0x64, 0x65, 0x72, 0x3C, 0x54, 0x3E, 0x20, 0x6E, 0x65, 0x77, 0x42, 0x75, 0x69, 0x6C, 0x64,
            0x65, 0x72, 0x28, 0x54, 0x20, 0x74, 0x29, 0x20, 0x7B, 0x0A, 0x09, 0x09, 0x69, 0x66, 0x20, 0x28, 0x74, 0x20,
            0x69, 0x6E, 0x73, 0x74, 0x61, 0x6E, 0x63, 0x65, 0x6F, 0x66, 0x20, 0x24, 0x7B, 0x63, 0x6C, 0x61, 0x73, 0x73,
            0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x29, 0x20, 0x7B, 0x0A, 0x09, 0x09, 0x09, 0x72, 0x65, 0x74, 0x75, 0x72, 0x6E,
            0x20, 0x28, 0x24, 0x7B, 0x70, 0x61, 0x63, 0x6B, 0x61, 0x67, 0x65, 0x43, 0x6F, 0x72, 0x65, 0x52, 0x6F, 0x6F,
            0x74, 0x7D, 0x2E, 0x42, 0x75, 0x69, 0x6C, 0x64, 0x65, 0x72, 0x3C, 0x54, 0x3E, 0x29, 0x20, 0x6E, 0x65, 0x77,
            0x20, 0x24, 0x7B, 0x70, 0x61, 0x63, 0x6B, 0x61, 0x67, 0x65, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x2E, 0x24, 0x7B,
            0x62, 0x75, 0x69, 0x6C, 0x64, 0x65, 0x72, 0x43, 0x6C, 0x61, 0x73, 0x73, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x28,
            0x28, 0x24, 0x7B, 0x63, 0x6C, 0x61, 0x73, 0x73, 0x4E, 0x61, 0x6D, 0x65, 0x7D, 0x29, 0x20, 0x74, 0x29, 0x3B,
            0x0A, 0x09, 0x09, 0x7D, 0x0A, 0x09, 0x09, 0x72, 0x65, 0x74, 0x75, 0x72, 0x6E, 0x20, 0x6E, 0x75, 0x6C, 0x6C,
            0x3B, 0x0A, 0x09, 0x7D, 0x0A, 0x7D});

}
