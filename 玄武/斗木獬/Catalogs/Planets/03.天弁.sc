// Object * 5 Aql A  ---  Spectroscopic Binary  ---  OID=@2640803   (@@57115,12)  ---  coobox=18901 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=173654
Barycenter "5 Aql A/HIP 92117/Gaia DR3 4260087321142851712/TIC 225849715/ADS 11667 A/AG-01 2257/BD-01 3559A/CSI-01 3559 2/GC 25713/GCRV 11218/GEN# +1.00173654A/HGAM 709/JP11 3015/PPM 180436/ROT 3526/SAO 142606/SKY# 34501/UBV 15957/UBV M 23205/YZ 91 4676/WDS J18465-0058Aa,Ab/SBC9 1080/CCDM J18465-0058A/HIC 92117/TYC 5114-2267-1/Renson 48670/PMSC 18413-0104AP/2MASS J18462859-0057421/** STF 2379A/** MCA 53/WDS J18465-0058A/HD 173654A/Gaia DR2 4260087321142851712"
{
	ParentBody      "5 Aql"
	BinaryOrbit     
	{
		Period          14650
		Separation      1163.53763259066 // 12.68 asec
	}
}

Barycenter "5 Aql Aa"
{
	ParentBody      "5 Aql A"
	BinaryOrbit // VB6_Doc2017f MCA_53Aa, Gr.4 ?
	{
		Period          41.2800
		Separation      9.45024618132411 // 0.103 asec
		Eccentricity    0.666
		Inclination     127.3
		AscendingNode   164.8
		Epoch           2456110.060882862657309
		ArgOfPericenter 178.0
		MeanAnomaly     0
	}
}

Star "5 Aql Aa1"
{
	DateUpdated     "2024-05-31"
	ParentBody      "5 Aql Aa"
	Parallax        10.8978
	AppMagn         5.9
	Class           "A2Vm" // kA3hA5VmA6
	AbsMagn         1.09 // 计算的值
	MassKg          5.16360016182626e+30 // log(g) = 4.068 cm/s^2
	RadSol          2.4675 // Gaia DR3
	LumBol          46.628861041283 // 计算的值
	Teff            9602
	FeH             0.569

	BinaryOrbit // SB9_1080 1985ApJS...59..229A
	{
		PeriodDays      4.7653
		Eccentricity    0.020
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2440002.047
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "5 Aql Aa2"
{
	DateUpdated     "2024-05-31"
	ParentBody      "5 Aql Aa"
	Class           ""
	MassSol         1.59
}

Star "5 Aql Ab"
{
	DateUpdated     "2024-05-31"
	ParentBody      "5 Aql A"
	Class           ""
	MassSol         1.79
}

// Object * 5 Aql B  ---  Star  ---  OID=@2640802   (@@57115,11)  ---  coobox=18901 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "5 Aql B/HIP 92118/Gaia DR3 4260087321142848512/TIC 225849739/ADS 11667 B/AG-01 2258/BD-01 3559B/CCDM J18465-0058B/CSI-01 3559 1/GCRV 6341 E/GEN# +1.00173654B/HIC 92118/PPM 180437/ROT 3573/SAO 142607/UBV 15958/YZ 91 4677/uvby98 100173654 B/2MASS J18462933-0057486/SSTGLMC G031.5101+00.6616/WDS J18465-0058B/** STF 2379B/TYC 5114-2268-1/Renson 48680/PMSC 18413-0104B/HD 173654B/Gaia DR1 4260087316833373056/TYC 5114-2270-1/WEB 15879/Gaia DR2 4260087321142848512"
{
	DateUpdated     "2024-05-31"
	ParentBody      "5 Aql"
	Parallax        10.9143
	AppMagn         7.51
	Class           "F3Vm" // kA4hF0VmF3
	AbsMagn         2.7 // 计算的值
	MassSol         1.53
}

// Object * f Aql  ---  Spectroscopic Binary  ---  OID=@2617330   (@@58896,1)  ---  coobox=18925 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "26 Aql A"
{
	DateUpdated     "2024-05-31"
	ParentBody      "26 Aql"
	Class           "G8IV"
	AbsMagn         1.77 // 计算的值
	MassSol         3.2
	RadSol          6
	LumBol          21
	Teff            4940
	FeH             -0.21

	BinaryOrbit     
	{
		PeriodDays      266.544
		Eccentricity    0.833
	}
}

Star "26 Aql B"
{
	DateUpdated     "2024-05-31"
	ParentBody      "26 Aql"
	Class           ""
	MassSol         1.4
}