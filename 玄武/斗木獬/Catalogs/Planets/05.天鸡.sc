// Object * e01 Sgr  ---  High Proper Motion Star  ---  OID=@2555896   (@@59915,0)  ---  coobox=19207 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=96808
Barycenter "54 Sgr A"
{
	ParentBody      "54 Sgr"
	BinaryOrbit     
	{
		Period          105974
		Separation      3516.7524890398 // 45.69 asec
	}
}

Star "54 Sgr Aa"
{
	DateUpdated     "2024-06-01"
	ParentBody      "54 Sgr A"
	Class           "K1III"
	AbsMagn         0.86 // 计算的值
	MassSol         1.84

	BinaryOrbit     
	{
		Period          11.440
		Separation      7.69935957587501 // 0.1 asec
	}
}

Star "54 Sgr Ab"
{
	DateUpdated     "2024-06-01"
	ParentBody      "54 Sgr A"
	Class           "F8V"
	MassSol         1.18
}

// Object HD 185673  ---  High Proper Motion Star  ---  OID=@2555898   (@@59915,2)  ---  coobox=19207 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,X-ray Source 
Barycenter "HD 185673/Gaia DR3 4181678604337106048/TIC 439340924/WDS J19407-1618C/ADS 12767 C/BD-16 5400/CCDM J19407-1618C/GC 27217/GCRV 6728 E/GEN# +1.00185673/GSC 06299-02608/PPM 236339/SAO 162884/TYC 6299-2608-1/UBV 16701/UBV M 24010/YZ 106 7397/uvby98 100185673/2MASS J19404548-1617016/1RXS J194046.3-161702/** HJ 599C/PMSC 19350-1631C/Gaia DR1 4181678600036750976/WEB 16990/Gaia DR2 4181678604337106048"
{
	ParentBody      "54 Sgr"
}

Star "HD 185673 A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "HD 185673"
	Parallax        12.8611
	AppMagn         8.11
	Class           "F7V"
	AbsMagn         0.864 // 计算的值
	MassKg          2.4638802213725e+30 // log(g) = 4.138 cm/s^2
	RadSol          1.5725 // Gaia DR3
	LumBol          2.82043943654119 // 计算的值
	Teff            5965
	FeH             -0.5

	BinaryOrbit     
	{
		Period          30.238
		Separation      12.2055002697945 // 0.157 asec
	}
}

Star "HD 185673 B"
{
	DateUpdated     "2024-06-01"
	ParentBody      "HD 185673"
	Class           ""
	MassSol         0.65
}
