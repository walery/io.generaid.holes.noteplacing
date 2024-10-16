package io.generaid.holes.noteplacing;

import java.util.Map;

import static java.util.Map.entry;

public class Sources {
    public static Map<String, Hole> fetchHolesAsMap() {
        return Map.<String, Hole>ofEntries(
                entry("A1", new Hole("A1", "45", "20", "9", "9")),
                entry("A2", new Hole("A2", "45", "860", "9", "9")),
                entry("A3", new Hole("A3", "45", "1440", "9", "9")),
                entry("A4", new Hole("A4", "908", "680", "9", "9")),
                entry("A5", new Hole("A5", "908", "1440", "9", "9")),
                entry("A6", new Hole("A6", "933", "45", "9", "9")),
                entry("B1", new Hole("B1", "65.3", "390", "6.8", "6.8")),
                entry("B2", new Hole("B2", "65.3", "560", "6.8", "6.8")),
                entry("B3", new Hole("B3", "215.3", "390", "6.8", "6.8")),
                entry("B4", new Hole("B4", "215.3", "560", "6.8", "6.8")),
                entry("B5", new Hole("B5", "264.46", "1160.14", "6.8", "6.8")),
                entry("B6", new Hole("B6", "264.46", "1198.14", "6.8", "6.8")),
                entry("B7", new Hole("B7", "529.69", "475", "6.8", "6.8")),
                entry("B8", new Hole("B8", "529.69", "645", "6.8", "6.8")),
                entry("B9", new Hole("B9", "529.69", "815", "6.8", "6.8")),
                entry("B10", new Hole("B10", "529.69", "985", "6.8", "6.8")),
                entry("B11", new Hole("B11", "530.31", "334.66", "6.8", "6.8")),
                entry("B12", new Hole("B12", "530.31", "1125.34", "6.8", "6.8")),
                entry("B13", new Hole("B13", "565.67", "299.3", "6.8", "6.8")),
                entry("B14", new Hole("B14", "565.67", "1160.7", "6.8", "6.8")),
                entry("B15", new Hole("B15", "618.73", "987.35", "6.8", "6.8")),
                entry("B16", new Hole("B16", "618.73", "1025.35", "6.8", "6.8")),
                entry("B17", new Hole("B17", "669.69", "310", "6.8", "6.8")),
                entry("B18", new Hole("B18", "669.69", "1150", "6.8", "6.8")),
                entry("B19", new Hole("B19", "759.51", "813.5", "6.8", "6.8")),
                entry("B20", new Hole("B20", "759.51", "851.5", "6.8", "6.8")),
                entry("B21", new Hole("B21", "786", "257.69", "6.8", "6.8")),
                entry("B22", new Hole("B22", "786", "1202.31", "6.8", "6.8")),
                entry("B23", new Hole("B23", "836.97", "295.16", "6.8", "6.8")),
                entry("B24", new Hole("B24", "836.97", "333.16", "6.8", "6.8")),
                entry("B25", new Hole("B25", "839.68", "604.66", "6.8", "6.8")),
                entry("B26", new Hole("B26", "839.68", "642.66", "6.8", "6.8")),
                entry("B27", new Hole("B27", "886", "257.69", "6.8", "6.8")),
                entry("B28", new Hole("B28", "886", "1202.31", "6.8", "6.8")),
                entry("B29", new Hole("B29", "911", "850", "6.8", "6.8")),
                entry("B30", new Hole("B30", "933", "345", "6.8", "6.8")),
                entry("C1", new Hole("C1", "65.3", "415", "10", "10")),
                entry("C2", new Hole("C2", "210.3", "525", "10", "10")),
                entry("D1", new Hole("D1", "110", "135", "50", "50")),
                entry("D2", new Hole("D2", "110", "1325", "50", "50")),
                entry("D3", new Hole("D3", "746", "330", "50", "50")),
                entry("D4", new Hole("D4", "906", "400", "50", "50")),
                entry("D5", new Hole("D5", "906", "470", "50", "50")),
                entry("D6", new Hole("D6", "911", "1130", "50", "50")),
                entry("E1", new Hole("E1", "131.4", "15", "5", "5")),
                entry("E2", new Hole("E2", "131.4", "1445", "5", "5")),
                entry("E3", new Hole("E3", "235.4", "15", "5", "5")),
                entry("E4", new Hole("E4", "235.4", "1445", "5", "5")),
                entry("E5", new Hole("E5", "445.2", "15", "5", "5")),
                entry("E6", new Hole("E6", "445.2", "1445", "5", "5")),
                entry("E7", new Hole("E7", "549.2", "15", "5", "5")),
                entry("E8", new Hole("E8", "549.2", "1445", "5", "5")),
                entry("F1", new Hole("F1", "143.4", "15", "6", "6")),
                entry("F2", new Hole("F2", "143.4", "1445", "6", "6")),
                entry("F3", new Hole("F3", "223.4", "15", "6", "6")),
                entry("F4", new Hole("F4", "223.4", "1445", "6", "6")),
                entry("F5", new Hole("F5", "457.2", "15", "6", "6")),
                entry("F6", new Hole("F6", "457.2", "1445", "6", "6")),
                entry("F7", new Hole("F7", "537.2", "15", "6", "6")),
                entry("F8", new Hole("F8", "537.2", "1445", "6", "6")),
                entry("F9", new Hole("F9", "609.69", "370", "6", "6")),
                entry("F10", new Hole("F10", "609.69", "1090", "6", "6")),
                entry("F11", new Hole("F11", "731", "257.69", "6", "6")),
                entry("F12", new Hole("F12", "731", "1202.31", "6", "6")),
                entry("F13", new Hole("F13", "941", "257.69", "6", "6")),
                entry("F14", new Hole("F14", "941", "1202.31", "6", "6")),
                entry("G1", new Hole("G1", "272.1", "7", "5", "5")),
                entry("G2", new Hole("G2", "272.5", "1453", "5", "5")),
                entry("G3", new Hole("G3", "408.1", "7", "5", "5")),
                entry("G4", new Hole("G4", "408.5", "1453", "5", "5")),
                entry("H1", new Hole("H1", "272.1", "20", "4.2", "4.2")),
                entry("H2", new Hole("H2", "272.5", "1440", "4.2", "4.2")),
                entry("H3", new Hole("H3", "408.1", "20", "4.2", "4.2")),
                entry("H4", new Hole("H4", "408.5", "1440", "4.2", "4.2")),
                entry("J1", new Hole("J1", "294", "399", "3.3", "3.3")),
                entry("J2", new Hole("J2", "294", "431", "3.3", "3.3")),
                entry("J3", new Hole("J3", "294", "1029", "3.3", "3.3")),
                entry("J4", new Hole("J4", "294", "1061", "3.3", "3.3")),
                entry("K1", new Hole("K1", "294", "407.5", "5", "5")),
                entry("K2", new Hole("K2", "294", "422.5", "5", "5")),
                entry("K3", new Hole("K3", "294", "1037.5", "5", "5")),
                entry("K4", new Hole("K4", "294", "1052.5", "5", "5")),
                entry("L1", new Hole("L1", "392.67", "500", "5", "5")),
                entry("L2", new Hole("L2", "392.67", "542.5", "5", "5")),
                entry("L3", new Hole("L3", "392.67", "667.5", "5", "5")),
                entry("L4", new Hole("L4", "392.67", "792.5", "5", "5")),
                entry("L5", new Hole("L5", "392.67", "917.5", "5", "5")),
                entry("L6", new Hole("L6", "392.67", "960", "5", "5")),
                entry("L7", new Hole("L7", "393.65", "455.16", "5", "5")),
                entry("L8", new Hole("L8", "393.65", "1004.84", "5", "5")),
                entry("L9", new Hole("L9", "398.79", "418.03", "5", "5")),
                entry("L10", new Hole("L10", "398.79", "1041.97", "5", "5")),
                entry("L11", new Hole("L11", "446.34", "303.22", "5", "5")),
                entry("L12", new Hole("L12", "446.34", "1156.78", "5", "5")),
                entry("L13", new Hole("L13", "534.22", "215.34", "5", "5")),
                entry("L14", new Hole("L14", "534.22", "1244.66", "5", "5")),
                entry("L15", new Hole("L15", "649.03", "167.78", "5", "5")),
                entry("L16", new Hole("L16", "649.03", "1292.22", "5", "5")),
                entry("L17", new Hole("L17", "686.16", "162.65", "5", "5")),
                entry("L18", new Hole("L18", "686.16", "1297.35", "5", "5")),
                entry("L19", new Hole("L19", "731", "161.67", "5", "5")),
                entry("L20", new Hole("L20", "731", "1298.33", "5", "5")),
                entry("L21", new Hole("L21", "773.5", "161.67", "5", "5")),
                entry("L22", new Hole("L22", "773.5", "1298.33", "5", "5")),
                entry("L23", new Hole("L23", "898.5", "161.67", "5", "5")),
                entry("L24", new Hole("L24", "898.5", "1298.33", "5", "5")),
                entry("M1", new Hole("M1", "392.67", "522.5", "6", "6")),
                entry("M2", new Hole("M2", "392.67", "937.5", "6", "6")),
                entry("M3", new Hole("M3", "761", "161.67", "6", "6")),
                entry("M4", new Hole("M4", "761", "1298.33", "6", "6")),
                entry("N1", new Hole("N1", "392.67", "984", "8", "8")),
                entry("P1", new Hole("P1", "856", "25", "3.3", "3.3")),
                entry("P2", new Hole("P2", "856", "500", "3.3", "3.3")),
                entry("P3", new Hole("P3", "856", "960", "3.3", "3.3")),
                entry("P4", new Hole("P4", "856", "1420", "3.3", "3.3")),
                entry("R1", new Hole("R1", "876.25", "17", "4.2", "4.2")),
                entry("R2", new Hole("R2", "876.25", "300", "4.2", "4.2")),
                entry("R3", new Hole("R3", "918.75", "17", "4.2", "4.2")),
                entry("R4", new Hole("R4", "918.75", "300", "4.2", "4.2")),
                entry("T1", new Hole("T1", "933", "20", "7", "10")),
                entry("U1", new Hole("U1", "933", "1440", "6.5", "6.5"))
        );
    }

    public static Map<String, Note> fetchNotesAsMap() {
        return Map.<String, Note>ofEntries(
                entry("A1", new Note("A1", "0", "0", "45", "22.5")),
                entry("A2", new Note("A2", "0", "0", "45", "22.5")),
                entry("A3", new Note("A3", "0", "0", "45", "22.5")),
                entry("A4", new Note("A4", "0", "0", "45", "22.5")),
                entry("A5", new Note("A5", "0", "0", "45", "22.5")),
                entry("A6", new Note("A6", "0", "0", "45", "22.5")),
                entry("B1", new Note("B1", "0", "0", "45", "22.5")),
                entry("B2", new Note("B2", "0", "0", "45", "22.5")),
                entry("B3", new Note("B3", "0", "0", "45", "22.5")),
                entry("B4", new Note("B4", "0", "0", "45", "22.5")),
                entry("B5", new Note("B5", "0", "0", "45", "22.5")),
                entry("B6", new Note("B6", "0", "0", "45", "22.5")),
                entry("B7", new Note("B7", "0", "0", "45", "22.5")),
                entry("B8", new Note("B8", "0", "0", "45", "22.5")),
                entry("B9", new Note("B9", "0", "0", "45", "22.5")),
                entry("B10", new Note("B10", "0", "0", "45", "22.5")),
                entry("B11", new Note("B11", "0", "0", "45", "22.5")),
                entry("B12", new Note("B12", "0", "0", "45", "22.5")),
                entry("B13", new Note("B13", "0", "0", "45", "22.5")),
                entry("B14", new Note("B14", "0", "0", "45", "22.5")),
                entry("B15", new Note("B15", "0", "0", "45", "22.5")),
                entry("B16", new Note("B16", "0", "0", "45", "22.5")),
                entry("B17", new Note("B17", "0", "0", "45", "22.5")),
                entry("B18", new Note("B18", "0", "0", "45", "22.5")),
                entry("B19", new Note("B19", "0", "0", "45", "22.5")),
                entry("B20", new Note("B20", "0", "0", "45", "22.5")),
                entry("B21", new Note("B21", "0", "0", "45", "22.5")),
                entry("B22", new Note("B22", "0", "0", "45", "22.5")),
                entry("B23", new Note("B23", "0", "0", "45", "22.5")),
                entry("B24", new Note("B24", "0", "0", "45", "22.5")),
                entry("B25", new Note("B25", "0", "0", "45", "22.5")),
                entry("B26", new Note("B26", "0", "0", "45", "22.5")),
                entry("B27", new Note("B27", "0", "0", "45", "22.5")),
                entry("B28", new Note("B28", "0", "0", "45", "22.5")),
                entry("B29", new Note("B29", "0", "0", "45", "22.5")),
                entry("B30", new Note("B30", "0", "0", "45", "22.5")),
                entry("C1", new Note("C1", "0", "0", "45", "22.5")),
                entry("C2", new Note("C2", "0", "0", "45", "22.5")),
                entry("D1", new Note("D1", "0", "0", "45", "22.5")),
                entry("D2", new Note("D2", "0", "0", "45", "22.5")),
                entry("D3", new Note("D3", "0", "0", "45", "22.5")),
                entry("D4", new Note("D4", "0", "0", "45", "22.5")),
                entry("D5", new Note("D5", "0", "0", "45", "22.5")),
                entry("D6", new Note("D6", "0", "0", "45", "22.5")),
                entry("E1", new Note("E1", "0", "0", "45", "22.5")),
                entry("E2", new Note("E2", "0", "0", "45", "22.5")),
                entry("E3", new Note("E3", "0", "0", "45", "22.5")),
                entry("E4", new Note("E4", "0", "0", "45", "22.5")),
                entry("E5", new Note("E5", "0", "0", "45", "22.5")),
                entry("E6", new Note("E6", "0", "0", "45", "22.5")),
                entry("E7", new Note("E7", "0", "0", "45", "22.5")),
                entry("E8", new Note("E8", "0", "0", "45", "22.5")),
                entry("F1", new Note("F1", "0", "0", "45", "22.5")),
                entry("F2", new Note("F2", "0", "0", "45", "22.5")),
                entry("F3", new Note("F3", "0", "0", "45", "22.5")),
                entry("F4", new Note("F4", "0", "0", "45", "22.5")),
                entry("F5", new Note("F5", "0", "0", "45", "22.5")),
                entry("F6", new Note("F6", "0", "0", "45", "22.5")),
                entry("F7", new Note("F7", "0", "0", "45", "22.5")),
                entry("F8", new Note("F8", "0", "0", "45", "22.5")),
                entry("F9", new Note("F9", "0", "0", "45", "22.5")),
                entry("F10", new Note("F10", "0", "0", "45", "22.5")),
                entry("F11", new Note("F11", "0", "0", "45", "22.5")),
                entry("F12", new Note("F12", "0", "0", "45", "22.5")),
                entry("F13", new Note("F13", "0", "0", "45", "22.5")),
                entry("F14", new Note("F14", "0", "0", "45", "22.5")),
                entry("G1", new Note("G1", "0", "0", "45", "22.5")),
                entry("G2", new Note("G2", "0", "0", "45", "22.5")),
                entry("G3", new Note("G3", "0", "0", "45", "22.5")),
                entry("G4", new Note("G4", "0", "0", "45", "22.5")),
                entry("H1", new Note("H1", "0", "0", "45", "22.5")),
                entry("H2", new Note("H2", "0", "0", "45", "22.5")),
                entry("H3", new Note("H3", "0", "0", "45", "22.5")),
                entry("H4", new Note("H4", "0", "0", "45", "22.5")),
                entry("J1", new Note("J1", "0", "0", "45", "22.5")),
                entry("J2", new Note("J2", "0", "0", "45", "22.5")),
                entry("J3", new Note("J3", "0", "0", "45", "22.5")),
                entry("J4", new Note("J4", "0", "0", "45", "22.5")),
                entry("K1", new Note("K1", "0", "0", "45", "22.5")),
                entry("K2", new Note("K2", "0", "0", "45", "22.5")),
                entry("K3", new Note("K3", "0", "0", "45", "22.5")),
                entry("K4", new Note("K4", "0", "0", "45", "22.5")),
                entry("L1", new Note("L1", "0", "0", "45", "22.5")),
                entry("L2", new Note("L2", "0", "0", "45", "22.5")),
                entry("L3", new Note("L3", "0", "0", "45", "22.5")),
                entry("L4", new Note("L4", "0", "0", "45", "22.5")),
                entry("L5", new Note("L5", "0", "0", "45", "22.5")),
                entry("L6", new Note("L6", "0", "0", "45", "22.5")),
                entry("L7", new Note("L7", "0", "0", "45", "22.5")),
                entry("L8", new Note("L8", "0", "0", "45", "22.5")),
                entry("L9", new Note("L9", "0", "0", "45", "22.5")),
                entry("L10", new Note("L10", "0", "0", "45", "22.5")),
                entry("L11", new Note("L11", "0", "0", "45", "22.5")),
                entry("L12", new Note("L12", "0", "0", "45", "22.5")),
                entry("L13", new Note("L13", "0", "0", "45", "22.5")),
                entry("L14", new Note("L14", "0", "0", "45", "22.5")),
                entry("L15", new Note("L15", "0", "0", "45", "22.5")),
                entry("L16", new Note("L16", "0", "0", "45", "22.5")),
                entry("L17", new Note("L17", "0", "0", "45", "22.5")),
                entry("L18", new Note("L18", "0", "0", "45", "22.5")),
                entry("L19", new Note("L19", "0", "0", "45", "22.5")),
                entry("L20", new Note("L20", "0", "0", "45", "22.5")),
                entry("L21", new Note("L21", "0", "0", "45", "22.5")),
                entry("L22", new Note("L22", "0", "0", "45", "22.5")),
                entry("L23", new Note("L23", "0", "0", "45", "22.5")),
                entry("L24", new Note("L24", "0", "0", "45", "22.5")),
                entry("M1", new Note("M1", "0", "0", "45", "22.5")),
                entry("M2", new Note("M2", "0", "0", "45", "22.5")),
                entry("M3", new Note("M3", "0", "0", "45", "22.5")),
                entry("M4", new Note("M4", "0", "0", "45", "22.5")),
                entry("N1", new Note("N1", "0", "0", "45", "22.5")),
                entry("P1", new Note("P1", "0", "0", "45", "22.5")),
                entry("P2", new Note("P2", "0", "0", "45", "22.5")),
                entry("P3", new Note("P3", "0", "0", "45", "22.5")),
                entry("P4", new Note("P4", "0", "0", "45", "22.5")),
                entry("R1", new Note("R1", "0", "0", "45", "22.5")),
                entry("R2", new Note("R2", "0", "0", "45", "22.5")),
                entry("R3", new Note("R3", "0", "0", "45", "22.5")),
                entry("R4", new Note("R4", "0", "0", "45", "22.5")),
                entry("T1", new Note("T1", "0", "0", "45", "22.5")),
                entry("U1", new Note("U1", "0", "0", "45", "22.5"))
        );
    }
}
