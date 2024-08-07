// Object * 27 CMa  ---  Be Star  ---  OID=@963312   (@@13774,1)  ---  coobox=7771 
// Object types: Be Star,Pulsating Variable,Near-IR Source (λ < 3 µm),Emission-line Star,Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,beta Cep Variable Candidate 
Remove "27 CMa A" {ParentBody "27 CMa"}
Remove "27 CMa Aa" {ParentBody "27 CMa A"}
Remove "27 CMa Ab" {ParentBody "27 CMa A"}
Remove "27 CMa B" {ParentBody "27 CMa"}
Star "27 CMa A"
{
	DateUpdated     "2024-07-21"
	ParentBody      "HIP 34981"
	Class           "B3IIIpe"
	AbsMagn         -4.13
	MassSol         12.5
	Radius          6528578.63576257 // 计算的值
	LumBol          15610
	Teff            21061
	Age             0.0001

	BinaryOrbit     
	{
		Period          118.54
		Separation      78.431586989699
		Eccentricity    0.747
		Inclination     80.2
		AscendingNode   131.3
		Epoch           2440956.162055438850075
		ArgOfPericenter 265.0
		MeanAnomaly     0
	}
}

Star "27 CMa B"
{
	DateUpdated     "2024-07-21"
	ParentBody      "HIP 34981"
	Class           "B8e" // GAM Cas Variable
}

// Object * 29 CMa  ---  Spectroscopic Binary  ---  OID=@963186   (@@13767,0)  ---  coobox=7769 
// Object types: Variable Star,Blue Supergiant,Spectroscopic Binary,Eclipsing Binary,Eclipsing Binary,Spectroscopic Binary,Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "UW CMa A" {ParentBody "UW CMa"}
Remove "UW CMa B" {ParentBody "UW CMa"}
Star "29 CMa A"
{
	DateUpdated     "2024-07-21"
	ParentBody      "29 CMa"
	Class           "O7.5Iabf"
	AbsMagn         -6.1
	MassSol         44 // 11
	RadSol          20 // 12
	LumBol          450000 // 170000
	Teff            33750

	BinaryOrbit     
	{
		PeriodDays      4.39
		SemiMajorAxisKm 33393600 // 23653800
		Eccentricity    0
		Inclination     71.6 // 71.0
		AscendingNode   4.5 // 3.3
	}
}

Star "29 CMa B"
{
	DateUpdated     "2024-07-21"
	ParentBody      "29 CMa"
	Class           "O9.7Ib"
	MassSol         33 // 17
	RadSol          17 // 14
	LumBol          330000 // 240000
	Teff            33700 // 33300
}

// Object * 2 Pup A  ---  Star  ---  OID=@1010223   (@@15137,6)  ---  coobox=7566 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Remove "2 Pup A" {ParentBody "2 Pup"}
Remove "2 Pup B" {ParentBody "2 Pup"}
Remove "2 Pup Ba" {ParentBody "2 Pup B"}
Remove "2 Pup Bb" {ParentBody "2 Pup B"}
Star "2 Pup A/HIP 37843/TIC 333941023/Gaia DR3 3029552046640275584/ADS 6348 A/BD-14 2194/CCDM J07454-1442A/CSI-14 2194 1/GC 10455/GEN# +1.00062864/GSC 05422-03295/HD 62864/HIC 37843/HR 3010/IDS 07409-1427 A/PPM 400111/SAO 153363/SKY# 14359/TYC 5422-3295-1/UBV 7460/2MASS J07452913-1441258/WDS J07455-1441A/PMSC 07409-1426A/** STF 1138A/Gaia DR1 3029552042340605440/Gaia DR2 3029552046640275584"
{
	DateUpdated     "2024-07-21"
	ParentBody      "PMSC 07409-1426"
	Parallax        11.7184
	AppMagn         5.997
	Class           "A0/1V" // Simbad似乎把光谱标反了
	AbsMagn         1.34 // 计算的值
	MassKg          3.82192302369235e+30 // log(g) = 4.177 cm/s^2
	RadSol          1.8725 // Gaia DR3
	LumBol          31.5007490313965 // 计算的值
	Teff            9993
	FeH             -0.614
}

// Object * 2 Pup B  ---  Spectroscopic Binary  ---  OID=@1010254   (@@15139,23)  ---  coobox=7566 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Eclipsing Binary,Double or Multiple Star,Star 
Barycenter "2 Pup B/HIP 37842/Gaia DR3 3029552115358950528/SBC9 475/ADS 6348 B/BD-14 2193/CCDM J07454-1442B/GC 10453/GSC 05422-03294/HD 62863/HIC 37842/HR 3009/IDS 07409-1427 B/PPM 219151/SAO 153362/SKY# 14358/TYC 5422-3294-1/V* PV Pup/2MASS J07452873-1441101/WDS J07455-1441B/** STF 1138B/PMSC 07409-1426B/PMSC 07409-1426Bab/Gaia DR1 3029552111060082048/uvby98 100062863/GEN# +1.00062863/WEB 7473/Gaia DR2 3029552115358950528"
{
	ParentBody      "PMSC 07409-1426"
	BinaryOrbit     
	{
		Period          24219
		Separation      1431.08274434299 // 16.77 asec
	}
}

// Object * 2 Pup B  ---  Spectroscopic Binary  ---  OID=@1010254   (@@15139,23)  ---  coobox=7566 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Eclipsing Binary,Double or Multiple Star,Star 
Star "2 Pup Ba"
{
	DateUpdated     "2024-07-21"
	ParentBody      "HIP 37842"
	Parallax        11.6909
	AppMagn         6.932
	Class           "A5/8"
	AbsMagn         2.27 // 计算的值
	MassKg          3.23768088908048e+30 // log(g) = 3.991 cm/s^2
	RadSol          2.135 // Gaia DR3
	LumBol          10.0245205450878 // 计算的值
	Teff            7029
	FeH             0.082

	BinaryOrbit     
	{
		PeriodDays      1.6607
		Eccentricity    0.050
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2443119.734
		ArgOfPericenter 329.7
		MeanAnomaly     0
	}
}

Star "2 Pup Bb"
{
	DateUpdated     "2024-07-21"
	ParentBody      "HIP 37842"
	Class           ""
	MassSol         1.45
}

// Object * 5 Pup A  ---  High Proper Motion Star  ---  OID=@5475376   (@@-1,255)  ---  coobox=7559 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Remove "5 Pup A" {ParentBody "5 Pup"}
Remove "5 Pup B" {ParentBody "5 Pup"}
Star "5 Pup A/WDS J07479-1212A/CCDM J07479-1212A/IDS 07433-1157 A/ADS 6381 A/HD 63336A/BD-11 2106A/** STF 1146A/TYC 5419-3186-1"
{
	DateUpdated     "2024-07-21"
	ParentBody      "HIP 38048"
	Class           "F5.5V"
	AbsMagn         3.3 // 计算的值

	BinaryOrbit     
	{
		Period          570.44
		Separation      69.3794809046415 // 2.409 asec
		Eccentricity    0.610
		Inclination     113.9
		AscendingNode   12.5
		Epoch           2471537.891359372064471
		ArgOfPericenter 329.9
		MeanAnomaly     0
	}
}

// Object * 5 Pup B  ---  High Proper Motion Star  ---  OID=@1009718   (@@15440,16)  ---  coobox=7559 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "5 Pup B/ADS 6381 B/BD-11 2106B/CCDM J07479-1212B/CSI-11 2106 1/GC 10521/GCRV 5192/SAO 153413/WDS J07479-1212B/** STF 1146B/HD 63336B/TYC 5419-3186-2/WEB 7504"
{
	DateUpdated     "2024-07-21"
	ParentBody      "HIP 38048"
	Class           "G3V"
	AbsMagn         4.95 // 计算的值
}

// Object * 16 Pup  ---  Star  ---  OID=@1053109   (@@14545,2)  ---  coobox=7614 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "16 Pup A"
{
	DateUpdated     "2024-07-21"
	ParentBody      "16 Pup"
	Class           "B5V"
	AbsMagn         -1.37
	MassKg          4.36683414048526e+30 // log(g) = 3.701 cm/s^2
	Radius          2408719.39916707 // 计算的值
	LumBol          836
	Teff            16680

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.6215981
		Eccentricity    0.59907229
		Inclination     -0.72230196
		AscendingNode   0
		ArgOfPericenter -60.9657903
		MeanAnomaly     -32.4638356
	}
}

Star "16 Pup B"
{
	ParentBody      "16 Pup"
	Class           "A5.4?"
}

// Object * ksi Pup  ---  Star  ---  OID=@1013154   (@@13824,1)  ---  coobox=7951 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Barycenter "KSI Pup A"
{
	ParentBody      "KSI Pup"
	BinaryOrbit     
	{
		Period          26000
		Separation      2000
	}
}

Star "KSI Pup Aa"
{
	DateUpdated     "2024-07-21"
	ParentBody      "KSI Pup A"
	Class           "G6Ib"
	AbsMagn         -3.89
	MassSol         9.9
	RadSol          124
	LumBol          6824
	Teff            4712 // 4925
	FeH             0.13
	Age             0.023
	Oblateness      0

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.8222416
		Eccentricity    0.369837772
		Inclination     -1.82714748
		AscendingNode   0
		ArgOfPericenter 206.773304
		MeanAnomaly     2.01199849
	}
}

Star "KSI Pup Ab"
{
	ParentBody      "KSI Pup A"
	Class           "O9.6?"
}

// Object * ksi Pup B  ---  Star  ---  OID=@12474336   (@@-1,255)  ---  coobox=7951 
// Object types: Double or Multiple Star,Star 
Star "KSI Pup B/Gaia DR3 5614465538065182336/CCDM J07493-2452B/** BU 1063B/WDS J07493-2452B/Gaia DR2 5614465538065182464"
{
	DateUpdated     "2024-07-21"
	ParentBody      "KSI Pup"
	Class           "G2V" // Sun-like star
}

// Object * l Pup  ---  Evolved Supergiant  ---  OID=@1014925   (@@13169,0)  ---  coobox=7980 
// Object types: Evolved Supergiant,Near-IR Source (λ < 3 µm),Emission-line Star,Variable Star,Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Star,Star,Asymptotic Giant Branch Star Candidate,Infra-Red Source,UV-emission Source 
Star "3 Pup A"
{
	DateUpdated     "2024-07-21"
	ParentBody      "3 Pup"
	Class           "A2.7Ib" // A2Ia - A3IIpe, A4Iabe
	AbsMagn         -5.5
	MassSol         31 // 39
	RadSol          55 // 115.83 - 146.96
	LumBol          63000 // 160000
	Teff            8500 // 9500

	BinaryOrbit     
	{
		Separation      2.3
	}
}

Star "3 Pup B"
{
	DateUpdated     "2024-07-21"
	ParentBody      "3 Pup"
	Class           "B8III" // B6V
	AbsMagn         -1 // ?
	MassSol         5
}

// Object * b Pup  ---  Spectroscopic Binary  ---  OID=@1035873   (@@12017,16)  ---  coobox=8120 
// Object types: Ellipsoidal Variable,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "HD 64503 A"
{
	DateUpdated     "2024-07-21"
	ParentBody      "HD 64503"
	Class           "B2V"
	AbsMagn         -2.00
	MassSol         6.0
	RadSol          7.3
	LumBol          2268
	Teff            15254
	FeH             -0.15
	Age             0.0241

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.463590632
		Eccentricity    0.0139493723
		Inclination     -1.18168831
		AscendingNode   0
		ArgOfPericenter 72.9296138
		MeanAnomaly     -110.537704
	}
}

Star "HD 64503 B"
{
	ParentBody      "HD 64503"
	Class           "A6.4?"
}

// Object * a Pup  ---  Spectroscopic Binary  ---  OID=@1017351   (@@12000,16)  ---  coobox=8111 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "HD 64440 A"
{
	DateUpdated     "2024-07-21"
	ParentBody      "HD 64440"
	Class           "K1II"
	AbsMagn         -1.44
	MassKg          3.78474476651475e+30 // log(g) = 1.66 cm/s^2
	Radius          23508296.5401412 // 计算的值
	LumBol          461
	Teff            4601
	FeH             0.02

	BinaryOrbit     
	{
		Period          7
		Eccentricity    0.38
	}
}

Star "HD 64440 B"
{
	DateUpdated     "2024-07-21"
	ParentBody      "HD 64440"
	Class           "A0.5"
}

// Object * sig Pup  ---  Spectroscopic Binary  ---  OID=@2962855   (@@67260,9)  ---  coobox=20992 
// Object types: Ellipsoidal Variable,High Proper Motion Star,High Proper Motion Star,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
// http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=36377
Remove "SIG Pup (AB)"{ParentBody "SIG Pup"}
Remove "SIG Pup C"{ParentBody "SIG Pup"}
Remove "SIG Pup A"{ParentBody "SIG Pup (AB)"}
Remove "SIG Pup B"{ParentBody "SIG Pup (AB)"}
Barycenter "SIG Pup A"
{
	ParentBody      "SIG Pup"
	BinaryOrbit     
	{
		Period          17732
		Separation      1200
		PositionAngle   74
	}
}

Star "SIG Pup Aa"
{
	DateUpdated     "2024-07-22"
	ParentBody      "SIG Pup A"
	Class           "K5III"
	AbsMagn         -0.50
	MassSol         1.65
	RadSol          43.7
	LumBol          344
	Teff            4077

	BinaryOrbit // VB6_Jnc2005 sig_Pup Gr.9
	{
		PeriodDays      257.8
		Separation      0.481837775420591 // 0.008 asec
		Eccentricity    0.170
		Inclination     65.6
		AscendingNode   0.0
		Epoch           2420418.6
		ArgOfPericenter 169.3
		MeanAnomaly     0
	}
}

Star "SIG Pup Ab"
{
	DateUpdated     "2024-07-22"
	ParentBody      "SIG Pup A"
	Class           ""
	MassSol         1.80
}

// Object * sig Pup B  ---  High Proper Motion Star  ---  OID=@2962856   (@@67260,10)  ---  coobox=20992 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "SIG Pup B/Gaia DR3 5512071009471894912/CCDM J07292-4318B/CD-43 3260B/CPC 0 4566/CPD-43 1499B/CSI-43 3260 22/GC 10042/GCRV 80058/GEN# +1.00059717B/HD 59717B/IDS 07261-4306 B/LTT 2862/PPM 311855/SAO 218757/UBV 7259/WDS J07292-4318B/** DUN 51B/PMSC 07261-4306B/TYC 7655-2688-1/UCAC4 234-015603/DENIS J072915.7-431759/WEB 7244/PPMX J072915.7-431758/Gaia DR2 5512071009471894912/NLTT 17969"
{
	DateUpdated     "2024-07-22"
	ParentBody      "SIG Pup"
	Parallax        17.6482
	AppMagn         9.49
	Class           "G5"
	AbsMagn         5.72 // 计算的值
	MassKg          1.96191198242445e+30 // log(g) = 4.48 cm/s^2
	RadSol          0.9465 // Gaia DR3
	LumBol          0.908341439524494 // 计算的值
	Teff            5792
	FeH             0.017
}

// Object HD 54309  ---  Be Star  ---  OID=@947270   (@@14107,20)  ---  coobox=7751 
// Object types: Be Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Emission-line Star,Star,Star,Infra-Red Source,UV-emission Source 
Star "HD 54309 A"
{
	DateUpdated     "2024-07-22"
	ParentBody      "HD 54309"
	Class           "B3Vne"
	AbsMagn         -3.52 // 计算的值
	MassKg          1.8332068092917e+31 // log(g) = 3.547 cm/s^2
	RadSol          8.470062 // Gaia DR3
	LumBol          6056.50300527958 // 计算的值
	Teff            17496
	FeH             0.576

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.8855908
		Eccentricity    0.534900586
		Inclination     2.2695283
		AscendingNode   0
		ArgOfPericenter -179.822064
		MeanAnomaly     -41.955696
	}
}

Star "HD 54309 B"
{
	ParentBody      "HD 54309"
	Class           "B2.8?"
}

// Object HD 54912  ---  Double or Multiple Star  ---  OID=@963066   (@@13757,5)  ---  coobox=7768 
// Object types: Eclipsing Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,UV-emission Source 
Star "HD 54912 A"
{
	DateUpdated     "2024-07-22"
	ParentBody      "HD 54912"
	Class           "B2V"
	AbsMagn         -3.33 // 计算的值
	MassKg          1.65909036139202e+31 // log(g) = 3.271 cm/s^2
	RadSol          11.07174 // Gaia DR3
	LumBol          8412.35701842748 // 计算的值
	Teff            16613
	FeH             0.171
	Oblateness      0

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.38990616
		Eccentricity    0.549034351
		Inclination     -2.34455299
		AscendingNode   0
		ArgOfPericenter 178.426965
		MeanAnomaly     -111.846122
	}
}

Star "HD 54912 B"
{
	ParentBody      "HD 54912"
	Class           "B4.4?"
}

// Object HD 60862  ---  Spectroscopic Binary  ---  OID=@996568   (@@13446,23)  ---  coobox=7968 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "HD 60862 A"
{
	DateUpdated     "2024-07-22"
	ParentBody      "HD 60862"
	Class           "A1V"
	AbsMagn         0.369 // 计算的值
	MassKg          5.80063306988774e+30 // log(g) = 3.888 cm/s^2
	RadSol          3.2175 // Gaia DR3
	LumBol          89.9187173115206 // 计算的值
	Teff            9909
	FeH             0.579

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   161.553245
		Eccentricity    0.259295453
		Inclination     -1.2812891
		AscendingNode   0
		ArgOfPericenter -123.056208
		MeanAnomaly     -156.785394
	}
}

Star "HD 60862 B"
{
	ParentBody      "HD 60862"
	Class           "A7.2?"
}