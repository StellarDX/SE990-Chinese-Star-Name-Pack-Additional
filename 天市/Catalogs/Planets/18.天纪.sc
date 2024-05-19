// Object * 25 Her  ---  Double or Multiple Star  ---  OID=@2915372   (@@50780,16)  ---  coobox=17914 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "25 Her A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "25 Her"
	Class           "A5V"
	AbsMagn         1.14 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0783240266
		Eccentricity    0.106186472
		Inclination     1.0837152
		AscendingNode   0
		ArgOfPericenter 131.430252
		MeanAnomaly     111.728118
	}
}

Star "25 Her B"
{
	ParentBody      "25 Her"
	Class           "F7.3?"
}

// Object * 32 Her  ---  Spectroscopic Binary  ---  OID=@2835059   (@@51524,9)  ---  coobox=18197 
// Object types: Spectroscopic Binary,Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=81066
Barycenter "32 Her A"
{
	ParentBody      "32 Her"
	BinaryOrbit     
	{
		Period          8045
		Separation      697.406654206648 // 4.120 asec
	}
}

Star "32 Her Aa"
{
	DateUpdated     "2024-05-19"
	ParentBody      "32 Her A"
	Class           "A8III"
	AbsMagn         0.72 // 计算的值
	MassSol         2.92

	BinaryOrbit     
	{
		PeriodDays      3.3943
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2452635.559
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "32 Her Ab"
{
	DateUpdated     "2024-05-19"
	ParentBody      "32 Her A"
	Class           ""
	MassSol         1.55
}

Star "32 Her B"
{
	DateUpdated     "2024-05-19"
	ParentBody      "32 Her"
	Class           ""
	MassSol         0.77
}

// Object * 39 Her  ---  Spectroscopic Binary  ---  OID=@2815354   (@@51529,9)  ---  coobox=18200 
// Object types: Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "39 Her A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "39 Her"
	Class           "F3V:"
	AbsMagn         2.74 // 计算的值
	MassKg          2.75088418678501e+30 // log(g) = 3.989 cm/s^2
	RadSol          1.9725 // Gaia DR3
	LumBol          6.57898981205008 // 计算的值
	Teff            6582
	FeH             -0.576

	BinaryOrbit     
	{
		PeriodDays      2.31
	}
}

Star "39 Her B"
{
	DateUpdated     "2024-05-19"
	ParentBody      "39 Her"
	Class           "F3V:"
}

// Object * 46 Her A  ---  Star  ---  OID=@11633997   (@@-1,255)  ---  coobox=18201 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "46 Her A/Gaia DR3 1310701354477617536/WISEA J164505.22+282128.5/TIC 236008090/TYC 2070-169-1/ADS 10194 A/CCDM J16451+2821A/CSI+28 2607 1/WDS J16451+2821A/UCAC4 592-056349/2MASS J16450524+2821285/WISE J164505.21+282128.6/Gaia DR2 1310701354477617536"
{
	DateUpdated     "2024-05-19"
	ParentBody      "46 Her"
	Parallax        5.3511
	AppMagn         7.3
	Class           "F8II"
	AbsMagn         0.942 // 计算的值
	MassKg          3.90934913318501e+30 // log(g) = 3.277 cm/s^2
	RadSol          5.337441 // Gaia DR3
	LumBol          33.8435851094692 // 计算的值
	Teff            6026
	FeH             -0.218

	BinaryOrbit     
	{
		Separation      992.319133451334 // 5.31 asec
	}
}

// Object * 46 Her B  ---  Star  ---  OID=@11606523   (@@-1,255)  ---  coobox=18201 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "46 Her B/Gaia DR3 1310701354474500864/WISEA J164505.39+282122.8/TIC 236008093/TYC 2070-1411-1/ADS 10194 B/BD+28 2607B/CCDM J16451+2821B/CSI+28 2607 2/2MASS J16450537+2821236/WDS J16451+2821B/Gaia DR2 1310701354474500864/UCAC4 592-056350/WISE J164505.38+282123.8"
{
	DateUpdated     "2024-05-19"
	ParentBody      "46 Her"
	Parallax        5.3463
	AppMagn         9.11
	Class           ""
	AbsMagn         0.942 // 计算的值
	MassKg          2.4268181889463e+30 // log(g) = 4.046 cm/s^2
	RadSol          1.735 // Gaia DR3
	LumBol          5.56686896380863 // 计算的值
	Teff            6731
	FeH             -0.501
}

// Object HD 157910  ---  High Proper Motion Star  ---  OID=@2896870   (@@53108,9)  ---  coobox=18374 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "HD 157910 A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "HD 157910"
	Class           "G5III"
	AbsMagn         -0.28 // 计算的值

	BinaryOrbit     
	{
		Separation      6668.82355215534 // 32.98 asec
	}
}

// Object BD+37 2882B  ---  High Proper Motion Star  ---  OID=@2896871   (@@53109,0)  ---  coobox=18374 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+37 2882B/Gaia DR3 1337327677809145600/TIC 101832939/ADS 10535 B/CCDM J17245+3657B/CSI+37 2882 2/GEN# +1.00157910B/GSC 02617-02082/HD 157910B/TYC 2617-2082-1/UBV 14870/2MASS J17242768+3657391/WDS J17245+3657B/** STT 329B/Gaia DR2 1337327677809145600"
{
	DateUpdated     "2024-05-19"
	ParentBody      "HD 157910"
	Parallax        4.9778
	AppMagn         9.84
	Class           "F0V"
	AbsMagn         3.33 // 计算的值
	MassKg          2.04382652867058e+30 // log(g) = 4.116 cm/s^2
	RadSol          1.468936 // Gaia DR3
	LumBol          3.81551073948338 // 计算的值
	Teff            6656
	FeH             -0.694
}
