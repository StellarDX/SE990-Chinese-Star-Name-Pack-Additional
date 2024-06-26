// Object * 52 Ari  ---  Double or Multiple Star  ---  OID=@620239   (@@21432,7)  ---  coobox=4224 
// Object types: Double or Multiple Star,Double or Multiple Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=19134
Barycenter "52 Ari AB"
{
	ParentBody      "52 Ari"
	BinaryOrbit     
	{
		Period          8878
		Separation      847.933730856524 // 5.13 asec
	}
}

Star "52 Ari A"
{
	DateUpdated     "2024-06-26"
	ParentBody      "52 Ari AB"
	Class           "B7Vn"
	AbsMagn         -0.62 // 计算的值
	MassSol         5.12
	RadSol          3.3
	LumBol          452
	Teff            12912

	BinaryOrbit // VB6_Hei1981a STF_346AB Gr.3
	{
		Period          227
		Separation      77.6860377413845 // 0.47 asec
		Eccentricity    0.73
		Inclination     77.5
		AscendingNode   92.8
		Epoch           2429082.138173068407923
		ArgOfPericenter 143
		MeanAnomaly     0
	}
}

Star "52 Ari B"
{
	DateUpdated     "2024-06-26"
	ParentBody      "52 Ari AB"
	Class           "B7Vn"
	MassSol         5.12
}

// Object * 52 Ari C  ---  Star  ---  OID=@620244   (@@21432,12)  ---  coobox=4224 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "52 Ari C/Gaia DR3 111968221155410048/TIC 34784415/CSI+24 431 6/HD 19135/HR 928/SKY# 4616/ADS 2336 C/BD+24 431C/CCDM J03055+2515C/CSI+24 431 2/GEN# +1.00019134C/UBV 2981/WDS J03054+2515C/2MASS J03052667+2515232/** STF 346C/Gaia DR2 111968221155410048"
{
	DateUpdated     "2024-06-26"
	ParentBody      "52 Ari"
	Class           ""
	MassSol         0.88
}

// Object * 33 Ari  ---  High Proper Motion Star  ---  OID=@1537969   (@@31935,13)  ---  coobox=12256 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "33 Ari A"
{
	DateUpdated     "2024-06-26"
	ParentBody      "33 Ari"
	Class           "A2/3V"
	AbsMagn         0.8 // 计算的值

	BinaryOrbit     
	{
		Separation      2273.37423198614 // 28.75 asec
	}
}

// Object * 33 Ari B  ---  High Proper Motion Star  ---  OID=@1537968   (@@31935,12)  ---  coobox=12256 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "33 Ari B/Gaia DR3 126974007959449728/TIC 436840254/ADS 2033 B/AG+26 265/BD+26 443B/CCDM J02407+2704B/CSI+26 443 1/GEN# +1.00016628B/HD 16628B/IDS 02348+2638 B/PPM 91891/UBV 2640/WDS J02407+2704B/2MASS J02404109+2704081/** STF 289B/TYC 1776-1397-1/UCAC2 41313732/UCAC4 586-006111/Gaia DR2 126974007959449728"
{
	DateUpdated     "2024-06-26"
	ParentBody      "33 Ari"
	Parallax        12.5789
	AppMagn         11.36
	Class           ""
	AbsMagn         6.86 // 计算的值
	MassKg          1.89765606602494e+30 // log(g) = 4.442 cm/s^2
	RadSol          0.9725 // Gaia DR3
	LumBol          0.824872714362765 // 计算的值
	Teff            5578
	FeH             -0.043
}
