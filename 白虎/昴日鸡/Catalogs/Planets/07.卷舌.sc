// Object HD 22124  ---  Spectroscopic Binary  ---  OID=@658020   (@@22242,0)  ---  coobox=4150 
// Object types: Ellipsoidal Variable,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=22124
Barycenter "HD 22124 A"
{
	ParentBody      "HD 22124"
	BinaryOrbit     
	{
		Period          5173
		Separation      433.999355889398 // 5.18 asec
	}
}

Star "HD 22124 Aa"
{
	DateUpdated     "2024-06-30"
	ParentBody      "HD 22124 A"
	Class           "F4IV"
	AbsMagn         2.04 // 计算的值
	MassKg          2.71454408138407e+30 // log(g) = 3.735 cm/s^2
	RadSol          2.625 // Gaia DR3
	LumBol          11.0748650164091 // 计算的值
	Teff            6499
	FeH             -0.417

	BinaryOrbit // SB9_176 1940PDDO....1..197N
	{
		PeriodDays      1.3264
		Eccentricity    0.020
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2429146.809
		ArgOfPericenter 212.6
		MeanAnomaly     0
	}
}

Star "HD 22124 Ab"
{
	DateUpdated     "2024-06-30"
	ParentBody      "HD 22124 A"
	Class           ""
	MassSol         0.54
}

// Object HD 22124B  ---  High Proper Motion Star  ---  OID=@658013   (@@22239,9)  ---  coobox=4150 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 22124 B/Gaia DR3 121499784377250432/TIC 90692892/ADS 2622 B/CCDM J03350+3201B/CSI+31 616 2/WDS J03350+3201B/** STF 410B/PMSC 03288+3141B/UCAC4 611-010578/2MASS J03350098+3200564/Gaia DR2 121499784377250432"
{
	DateUpdated     "2024-06-30"
	ParentBody      "HD 22124"
	Parallax        13.9551
	AppMagn         10.6
	Class           "K4"
	AbsMagn         6.32 // 计算的值
	MassKg          1.54796505862806e+30 // log(g) = 4.562 cm/s^2
	RadSol          0.765 // Gaia DR3
	LumBol          0.223404370807779 // 计算的值
	Teff            4537
	FeH             -0.005
}

// Object * 50 Per  ---  RS CVn Variable  ---  OID=@696749   (@@22668,0)  ---  coobox=4184 
// Object types: Rotating Variable,RS CVn Variable,High Proper Motion Star,Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "50 Per A"{ParentBody "50 Per"}
Remove "ADS 2995"{ParentBody "50 Per"}
Remove "ADS 2995 A"{ParentBody "ADS 2995"}
Remove "ADS 2995 B"{ParentBody "ADS 2995"}
Barycenter "50 Per E"
{
	ParentBody      "50 Per"
	BinaryOrbit     
	{
		Period          1.089E6
		Separation      15808.7385604396 // 745.98 asec
	}
}

Star "50 Per Ea"
{
	DateUpdated     "2024-06-30"
	ParentBody      "50 Per E"
	Class           "F8V"
	AbsMagn         3.87
	MassSol         1.16
	Radius          829261.261524729 // log(g) = 4.35 cm/s^2
	LumBol          1.8276173830012767 // 计算的值
	Teff            6147
	FeH             -0.11
	Age             0.60

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0329275253
		Eccentricity    0
		Inclination     -0.194112778
		AscendingNode   0
		ArgOfPericenter 126.020056
		MeanAnomaly     -58.0848704
	}
}

Star "50 Per Eb"
{
	ParentBody      "50 Per E"
	Class           "G4.1?"
}

// Object HD 25893  ---  Double or Multiple Star  ---  OID=@696744   (@@22666,2)  ---  coobox=4184 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Variable Star,Double or Multiple Star,High Proper Motion Star,Star,BY Dra Variable Candidate,Infra-Red Source,Radio Source,UV-emission Source,X-ray Source 
Barycenter "HD 25893/GJ 160.1/HIP 19255/TIC 353129911/PLX 907/SPOCS 2606/2RE J040731+380423/2RE J0407+380/ADS 2995 AB/AG+37 473/BD+37 878/CCDM J04075+3803AB/CSI+37 878 1/G 81-4/GC 4949/GCRV 2356/HIC 19255/IDS 04009+3749 AB/IRAS 04042+3756/PPM 69110/RGB J0407+380/SAO 56982/SKY# 6287/UBV 4034/V* V491 Per/[FS2003] 0155/[LH98] 127/1RXS J040734.6+380415/RX J0407.5+3804/[BSF97] J040742.2+380434/[SCB2001] 209/WDS J04076+3804AB/** STT 531AB/WEB 3695/2MASS J04073434+3804293/ASCC 469481/G 39-1/EUVE J0407+38.0/RE J0407+380/WISEA J040734.50+380427.4/RE J040733+380410/GEN# +1.00025893/WISE J040734.50+380427.3/** ALC 1AB/uvby98 100025893"
{
	ParentBody      "50 Per"
}

// Object HD 25893A  ---  High Proper Motion Star  ---  OID=@696745   (@@22666,3)  ---  coobox=4184 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,High Proper Motion Star,Star 
Star "HD 25893 A/GJ 160.1 A/TIC 664915372/Gaia DR3 225709641034907264/TYC 2877-247-1/ADS 2995 A/BD+37 878A/CCDM J04075+3803A/CSI+37 878 3/IDS 04009+3749 A/LTT 11346/NLTT 12566/LSPM J0407+3804W/WDS J04076+3804A/** STT 531A/PMSC 04019+3746A/Gaia DR2 225709641034907264/G 39-1A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "HD 25893"
	Parallax        47.325
	AppMagn         7.23
	Class           "G9V"
	AbsMagn         5.6 // 计算的值
	MassSol         0.88
}

// Object HD 25893B  ---  High Proper Motion Star  ---  OID=@696746   (@@22666,4)  ---  coobox=4184 
// Object types: High Proper Motion Star,Double or Multiple Star,High Proper Motion Star,Variable Star,Star 
Barycenter "HD 25893 B/GJ 160.1 B/Gaia DR3 225709641030792448/TYC 2877-247-2/ADS 2995 B/BD+37 878B/CCDM J04075+3803B/CSI+37 878 4/CSV 102431/IDS 04009+3749 B/LTT 11347/NLTT 12567/NSV 1463/LSPM J0407+3804E/WDS J04076+3804B/PMSC 04019+3746B/** STT 531B/Gaia DR2 225709641030792448/G 39-1B"
{
	ParentBody      "HD 25893"
	BinaryOrbit // VB6_Hei1986b STT_531AB Gr.5
	{
		Period          590
		Separation      78.883002701248 // 3.870 asec
		Eccentricity    0.250
		Inclination     104.0
		AscendingNode   160.3
		Epoch           2477111.487312769982964
		ArgOfPericenter 195.0
		MeanAnomaly     0
	}
}

Star "HD 25893 Ba"
{
	DateUpdated     "2024-06-30"
	ParentBody      "HD 25893 B"
	Parallax        47.1305
	AppMagn         9.54
	Class           ""
	AbsMagn         7.91 // 计算的值
	MassSol         0.62

	BinaryOrbit     
	{
		Period          7.080
		Separation      3.81180074471066 // 0.187? asec
	}
}

Star "HD 25893 Bb"
{
	DateUpdated     "2024-06-30"
	ParentBody      "HD 25893 B"
	Class           ""
	MassSol         0.62
}

// Object * f Per  ---  Spectroscopic Binary  ---  OID=@696661   (@@23062,0)  ---  coobox=4179 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "52 Per A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "52 Per"
	Class           "G5II"
	AbsMagn         -1.6
	MassSol         4.0
	RadSol          32.40
	LumBol          531.1
	Teff            4868
}

Barycenter "52 Per B"
{
	ParentBody      "f Per"
	BinaryOrbit     
	{
		PeriodDays      1576.44
		Eccentricity    0.41
		Epoch           2425927.4
		ArgOfPericenter 66.7
		MeanAnomaly     0
	}
}

Star "52 Per Ba"
{
	DateUpdated     "2024-06-30"
	ParentBody      "52 Per B"
	Class           "A2V"
	AbsMagn         1.1
	MassSol         2.4
	Teff            10232

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.234624717
		Eccentricity    0
		Inclination     -2.09312248
		AscendingNode   0
		ArgOfPericenter 154.580443
		MeanAnomaly     -35.7926558
	}
}

Star "52 Per Bb"
{
	DateUpdated     "2024-06-30"
	ParentBody      "52 Per B"
	Class           ""
	MassSol         1
}