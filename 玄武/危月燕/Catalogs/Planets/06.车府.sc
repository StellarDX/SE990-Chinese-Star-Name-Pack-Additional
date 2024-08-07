// Object * 51 Cyg  ---  Star  ---  OID=@116941   (@@9969,0)  ---  coobox=199 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "51 Cyg A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "51 Cyg"
	Class           "B2V"
	AbsMagn         -2.46 // 计算的值
	MassKg          1.11739339599044e+31 // log(g) = 3.596 cm/s^2
	RadSol          6.250056 // Gaia DR3
	LumBol          2530.38573237083 // 计算的值
	Teff            16375
	FeH             -0.471

	BinaryOrbit     
	{
		Separation      1219.64934086958 // 3.26 asec
	}
}

Star "51 Cyg B"
{
	ParentBody      "51 Cyg"
	Class           "B1.4?"
}

// Object * 60 Cyg  ---  Be Star  ---  OID=@58986   (@@10257,0)  ---  coobox=63 
// Object types: Be Star,Emission-line Star,Eclipsing Binary,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=14549
Barycenter "60 Cyg A"
{
	ParentBody      "60 Cyg"
	BinaryOrbit     
	{
		Period          13724
		Separation      1089.36548607578 // 2.90 asec
	}
}

Star "60 Cyg Aa"
{
	DateUpdated     "2024-06-13"
	ParentBody      "60 Cyg A"
	Class           "B1Ve"
	AbsMagn         -2.44 // 计算的值
	MassSol         10.82
	RadSol          6.5 // Gaia DR3
	LumBol          5951.44977443305 // 计算的值
	Teff            19885
	FeH             0.256

	BinaryOrbit     
	{
		PeriodDays      146.6
		Separation      1.57367558477094 // 2.602 mas
	}
}

Star "60 Cyg Ab"
{
	DateUpdated     "2024-06-13"
	ParentBody      "60 Cyg A"
	Class           ""
	MassSol         1.77
}

// Object * 60 Cyg B  ---  Star  ---  OID=@11608741   (@@-1,255)  ---  coobox=63 
// Object types: Double or Multiple Star,Star 
Star "60 Cyg B/Gaia DR3 2163533670220600704/TYC 3588-12112-2/** STT 426B/ADS 14549 B/CCDM J21012+4609B/WDS J21012+4609B/Gaia DR2 2163533670220600704"
{
	DateUpdated     "2024-06-13"
	ParentBody      "60 Cyg"
	Class           ""
	MassSol         2.30
}

// Object * 75 Cyg  ---  Double or Multiple Star  ---  OID=@14747   (@@9892,11)  ---  coobox=134 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
Star "75 Cyg A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "75 Cyg"
	Class           "M1IIIab"
	AbsMagn         -0.36
	RadSol          44.61
	LumBol          438.5
	Teff            3954

	BinaryOrbit     
	{
		Separation      530.868910103121 // 2.7 asec
	}
}

Star "75 Cyg B"
{
	ParentBody      "75 Cyg"
	Class           "F9.5?"
}


// ----------------------------------------------------------------------------------------------------

// Object * 77 Cyg  ---  Spectroscopic Binary  ---  OID=@2466   (@@9886,7)  ---  coobox=129 
// Object types: Double or Multiple Star,Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=107162
Barycenter "77 Cyg AB"
{
	ParentBody      "77 Cyg"
	BinaryOrbit     
	{
		Period          821606
		Separation      20118.8364162973 // 159.14 asec
	}
}

// Object HD 206656  ---  Double or Multiple Star  ---  OID=@2379   (@@9880,4)  ---  coobox=129 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Barycenter "HD 206656/Gaia DR3 1954515616417946240/WISEA J214233.44+410250.9/TIC 305307944/ADS 15251 AB/AG+40 2248/BD+40 4617/CCDM J21426+4103AB/CSI+40 4617 1/GC 30402/GSC 03188-00957/HIC 107177/HIP 107177/IDS 21385+4035 AB/PPM 61907/SAO 51212/SKY# 41385/UBV 18646/2MASS J21423342+4102507/WDS J21426+4103AB/** BU 688AB/uvby98 100206656/** ARY 129C/GEN# +1.00206656/UCAC4 656-101320/WISE J214233.44+410250.8"
{
	ParentBody      "77 Cyg"
}

// ----------------------------------------------------------------------------------------------------

Barycenter "77 Cyg A"
{
	ParentBody      "77 Cyg AB"
	BinaryOrbit // VB6_Hrt2000c KUI_108 Gr.2
	{
		Period          26.4900
		Separation      19.3416509168584 // 0.153 asec
		Eccentricity    0.333
		Inclination     142.4
		AscendingNode   12.3
		Epoch           2442311.210612916387618
		ArgOfPericenter 176.1
		MeanAnomaly     0
	}
}

Barycenter "77 Cyg B"
{
	ParentBody      "77 Cyg AB"
}

// ----------------------------------------------------------------------------------------------------

// Object HD 206656A  ---  Star  ---  OID=@8447699   (@@-1,255)  ---  coobox=129 
// Object types: Double or Multiple Star,Star 
Star "HD 206656A/** BU 688A/CCDM J21426+4103A/WDS J21426+4103A/TYC 3188-957-1"
{
	DateUpdated     "2024-06-13"
	ParentBody      "HD 206656"
	Parallax        8.3
	Class           "F2V"
	MassSol         1.49

	BinaryOrbit // VB6_USN2006a BU_688AB Gr.3
	{
		Period          110.6700
		Separation      47.4685617340468 // 0.394 asec
		Eccentricity    0.979
		Inclination     100.4
		AscendingNode   185.2
		Epoch           2432705.340784976258874
		ArgOfPericenter 122.1
		MeanAnomaly     0
	}
}

// Object HD 206656B  ---  Star  ---  OID=@8447700   (@@-1,255)  ---  coobox=129 
// Object types: Double or Multiple Star,Star 
Star "HD 206656B/** BU 688B/CCDM J21426+4103B/WDS J21426+4103B/TYC 3188-957-2"
{
	DateUpdated     "2024-06-13"
	ParentBody      "HD 206656"
	Class           ""
	MassSol         1.49
}

// ----------------------------------------------------------------------------------------------------

Star "77 Cyg A1"
{
	DateUpdated     "2024-06-13"
	ParentBody      "77 Cyg A"
	Class           "A1V"
	AbsMagn         0.22 // 计算的值
	MassSol         2.02

	BinaryOrbit // SB9_1324 1936ApJ....84...85L
	{
		PeriodDays      1.7290
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2424255.750
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "77 Cyg A2"
{
	DateUpdated     "2024-06-13"
	ParentBody      "77 Cyg A"
	Class           "A1V"
	MassSol         2.02
}

// ----------------------------------------------------------------------------------------------------

Star "77 Cyg Ba"
{
	DateUpdated     "2024-06-13"
	ParentBody      "77 Cyg B"
	Class           "B8V"
	MassSol         2.26

	BinaryOrbit // 2004RMxAAC.2145 Fekel
	{
		PeriodDays      35.4730
		Eccentricity    0.027
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2451087.300
		ArgOfPericenter 261.1
		MeanAnomaly     0
	}
}

Star "77 Cyg Bb"
{
	DateUpdated     "2024-06-13"
	ParentBody      "77 Cyg B"
	Class           "F0"
	MassSol         1.70
}

// ----------------------------------------------------------------------------------------------------

// Object * 72 Cyg  ---  High Proper Motion Star  ---  OID=@1583539   (@@32468,4)  ---  coobox=9597 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Star "72 Cyg A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "72 Cyg"
	Class           "K0.5IIIFe0.5"
	AbsMagn         0.62
	MassSol         1.70
	RadSol          14
	LumBol          69
	Teff            4640
	FeH             0.18
	Age             0.900

	BinaryOrbit
	{
		Separation      4690
	}
}

Star "72 Cyg B"
{
	DateUpdated     "2024-06-13"
	ParentBody      "72 Cyg"
	Class           "M5"
}

// Object * 6 Lac  ---  Spectroscopic Binary  ---  OID=@4153   (@@8543,0)  ---  coobox=512 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "6 Lac A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "6 Lac"
	Class           "B2IV"
	AbsMagn         -2.62
	MassSol         12.5
	RadSol          6.9
	LumBol          34590
	Teff            21150
	FeH             -0.04
	Age             0.0157

	BinaryOrbit     
	{
		PeriodDays      880
		Eccentricity    0.30
		Epoch           2416300
		ArgOfPericenter 10
		MeanAnomaly     0
	}
}

Star "6 Lac B"
{
	DateUpdated     "2024-06-13"
	ParentBody      "6 Lac"
	Class           "B8.3?"
}

// Object * 8 Lac A  ---  Be Star  ---  OID=@1552686   (@@32513,5)  ---  coobox=10067 
// Object types: Be Star,Pulsating Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Emission-line Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source,beta Cep Variable Candidate 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=16095
// NoirLab还提到了一颗伴星D，距离太远，故不包含在内
Barycenter "8 Lac A/Gaia DR3 1908368597999299840/WISEA J223552.25+393803.2/HD 214168/WISE J223552.27+393803.5/TIC 128495470/[JE82] 1122/[JE82] 1121/WDS J22359+3938A/ADS 16095 A/AG+39 2418/BD+38 4808/CCDM J22358+3937A/CEL 5491/CSI+38 4808 1/EM* MWC 390/GC 31551/GCRV 14195/HIC 111546/HIP 111546/HR 8603/IDS 22314+3907 A/N30 4974/PPM 87963/ROT 3292/SAO 72509/TD1 29206/UBV 19324/UBV M 26492/YPAC 215/[S78b] 387A/uvby98 100214168 A/2MASS J22355228+3938034/ALS 14843/WDS J22359+3938Aa,Ab/** STF 2922A/TYC 3205-2482-1/PMSC 22314+3907A/PMSC 22314+3907Aab/** CHR 112/Gaia DR1 1908368593700046208/uvby98 100214167/GEN# +1.00214167/WEB 19939/Gaia DR2 1908368597999299840"
{
	ParentBody      "8 Lac"
	BinaryOrbit     
	{
		Period          267888
		Separation      11816.6437268831 // 22.35 asec
	}
}

Star "8 Lac Aa"
{
	DateUpdated     "2024-06-13"
	ParentBody      "8 Lac A"
	Class           "B1Vne"
	AbsMagn         -2.93 // 计算的值
	MassKg          2.17688428901392e+31 // log(g) = 3.756 cm/s^2
	RadSol          7.256021 // Gaia DR3
	LumBol          5810.32178719277 // 计算的值
	Teff            18708
	FeH             0.408

	BinaryOrbit     
	{
		Period          41.6
		Separation      30.1061866345461 // 0.057 asec
		Eccentricity    0.440
		Inclination     69.1
		AscendingNode   119.7
		Epoch           2459908.579750184901059
		ArgOfPericenter 107.9
		MeanAnomaly     0
	}
}

Star "8 Lac Ab"
{
	DateUpdated     "2024-06-13"
	ParentBody      "8 Lac A"
	Class           ""
	MassSol         8.03
}

// Object * 8 Lac B  ---  Star  ---  OID=@1552687   (@@32514,0)  ---  coobox=10067 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "8 Lac B/Gaia DR3 1908368593700046720/HD 214167/TIC 128495477/WDS J22359+3938B/ADS 16095 B/AG+39 2417/BD+38 4808B/CCDM J22358+3937B/CSI+38 4808 2/GC 31550/GCRV 14196/HIC 111544/HIP 111544/IDS 22314+3907 B/MCW 1063/PPM 87962/ROT 3291/SAO 72508/SKY# 42977/UBV 19325/UBV M 26491/[S78b] 387B/2MASS J22355209+3937412/ALS 16644/** STF 2922B/GSC 03205-02483/TYC 3205-2483-1/UCAC3 260-251840/PMSC 22314+3907B/WEB 19940/Gaia DR2 1908368593700046720"
{
	DateUpdated     "2024-06-13"
	ParentBody      "8 Lac"
	Parallax        2.1711
	AppMagn         5.67
	Class           "B1.Vs"
	AbsMagn         -2.65 // 计算的值
	MassKg          1.41377112916788e+31 // log(g) = 3.773 cm/s^2
	RadSol          5.734168 // Gaia DR3
	LumBol          3485.71785308106 // 计算的值
	Teff            18521
	FeH             0.093
}

// Object * 10 Lac  ---  Double or Multiple Star  ---  OID=@1552788   (@@32520,0)  ---  coobox=10067 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,UV-emission Source,X-ray Source 
Star "10 Lac A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "10 Lac"
	Class           "O9V"
	AbsMagn         -4.40
	MassSol         26.9
	RadSol          8.27
	LumBol          102000
	Teff            36000

	BinaryOrbit     
	{
		Separation      28521.897664654 // 62.52 asec
	}
}

// Object AG+38 2351  ---  Star  ---  OID=@1552701   (@@32515,3)  ---  coobox=10067
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star
Star "AG+38 2351/Gaia DR3 1908095884755828864/WISEA J223919.74+390341.9/TIC 128692429/ADS 16148 B/CCDM J22393+3903B/CSI+38 4826 1/GEN# +1.00214680B/IDS 22348+3832 B/PPM 88035/2MASS J22391973+3903419/WDS J22393+3903B/** S 813B/TYC 3201-2065-1/UCAC2 45587923/UCAC3 259-254622/UCAC4 646-115019/WISE J223919.74+390341.9"
{
	ParentBody      "10 Lac"
	Class           "B8.2?"
}

// Object * 12 Lac  ---  beta Cep Variable  ---  OID=@1553104   (@@32527,0)  ---  coobox=10073 
// Object types: beta Cep Variable,Pulsating Variable,Double or Multiple Star,Variable Star,beta Cep Variable,Near-IR Source (λ < 3 µm),Star,UV-emission Source,X-ray Source,beta Cep Variable Candidate 
Star "12 Lac A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "12 Lac"
	Class           "B2III"
	AbsMagn         -3.02
	MassSol         9.5
	RadSol          8.4
	LumBol          8877
	Teff            23809
	FeH             -0.41
	Age             0.0218

	BinaryOrbit     
	{
		Separation      26664.6055048435 // 69 asec
	}
}

// Object TYC 3218-879-1  ---  Star  ---  OID=@1553068   (@@32282,3)  ---  coobox=10073 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "TYC 3218-879-1/Gaia DR3 1932278680935392640/TIC 128821864/BDS 11910 B/CCDM J22415+4014B/CSI+39 4912 2/IDS 22370+3942 B/2MASS J22413016+4014377/WDS J22415+4014B/** S 815B/Gaia DR2 1932278680935392640"
{
	DateUpdated     "2024-06-13"
	ParentBody      "12 Lac"
	Parallax        2.0106
	AppMagn         10.78
	Class           "A3V"
	AbsMagn         2.3 // 计算的值
	MassKg          3.04876507527308e+30 // log(g) = 3.951 cm/s^2
	RadSol          2.169416 // Gaia DR3
	LumBol          18.7900133439754 // 计算的值
	Teff            8159
	FeH             -0.639
}

// Object * 14 Lac  ---  Eclipsing Binary  ---  OID=@1586348   (@@33240,0)  ---  coobox=10078 
// Object types: Be Star,Eclipsing Binary,Near-IR Source (λ < 3 µm),Variable Star,Emission-line Star,Double or Multiple Star,Star,UV-emission Source 
Star "14 Lac A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "14 Lac"
	Class           "B4III"
	AbsMagn         -2.56 // 计算的值
	MassSol         7.45
	RadSol          7.55 // 两极
	LumBol          5391.102659855845 // 计算的值
	Teff            18000 // 两极

	BinaryOrbit     
	{
		PeriodDays      10.085415
		SemiMajorAxisKm 28055493.9 // 40.327 RSun
		Eccentricity    0.0
		Inclination     65
		Epoch           2441170.285
		ArgOfPericenter 25.8
		MeanAnomaly     0
	}
}

Star "14 Lac B"
{
	DateUpdated     "2024-06-13"
	ParentBody      "14 Lac"
	Class           "F9III"
	MassSol         1.21
	RadSol          8.85 // 两极
	LumBol          91.45031825581819 // 计算的值
	Teff            6000 // 两极
}

// Object * 16 Lac  ---  beta Cep Variable  ---  OID=@1586669   (@@33246,0)  ---  coobox=10100 
// Object types: beta Cep Variable,Eclipsing Binary,Double or Multiple Star,Variable Star,beta Cep Variable,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source,beta Cep Variable Candidate 
// NoirLab; https://ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=113281
Barycenter "16 Lac A"
{
	ParentBody      "16 Lac"
	BinaryOrbit     
	{
		Separation      12310.7160449276 // 27.56 asec
	}
}

Star "16 Lac Aa"
{
	DateUpdated     "2024-06-13"
	ParentBody      "16 Lac A"
	Class           "B2IV"
	AbsMagn         -2.67
	MassSol         9.5
	RadSol          5.6
	LumBol          7762
	Teff            23000
	FeH             0.00

	BinaryOrbit // SB9_1409 2001A&A...367..236L
	{
		PeriodDays      12.0969
		Eccentricity    0.0539
		Epoch           2439053.648
		ArgOfPericenter 241.4
		MeanAnomaly     0
	}
}

Star "16 Lac Ab"
{
	DateUpdated     "2024-06-13"
	ParentBody      "16 Lac A"
	Class           "F6-7"
	MassSol         1.34
}

// Object UCAC4 659-109943  ---  Star  ---  OID=@1586665   (@@33245,12)  ---  coobox=10100 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC4 659-109943/Gaia DR3 1931240295282529920/TIC 129538122/ADS 16381 B/CCDM J22564+4136B/CSI+40 4949 2/GEN# +1.00216916B/IDS 22518+4104 B/UBV 19665/[S78b] 396B/WDS J22564+4136B/** STF 2960B/2MASS J22562300+4136405/PMSC 22518+4104B/Gaia DR2 1931240295282529920"
{
	DateUpdated     "2024-06-13"
	ParentBody      "16 Lac"
	Class           "F0"
	MassSol         1.50
}

// Object * omi And  ---  Be Star  ---  OID=@1586709   (@@33250,0)  ---  coobox=10102 
// Object types: Be Star,Spectroscopic Binary,Variable Star,Emission-line Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=113726
Remove "OMI And A"{ParentBody "OMI And"}
Remove "OMI And B"{ParentBody "OMI And"}
Remove "OMI And Aa"{ParentBody "OMI And A"}
Remove "OMI And Ab"{ParentBody "OMI And A"}
Remove "OMI And Ba"{ParentBody "OMI And B"}
Remove "OMI And Bb"{ParentBody "OMI And B"}
Barycenter "OMI And A"
{
	ParentBody      "Gaia DR3 1931192500887330688"
	BinaryOrbit // VB6_Zhu2010 WRH_37AB Gr.3 (Combined)
	{
		Period          118
		Separation      32.6703541252753 // 0.304 asec
		Eccentricity    0.340
		Inclination     107.4
		AscendingNode   5.6
		Epoch           2455050.858506397344172
		ArgOfPericenter 144.2
		MeanAnomaly     0
	}
}

Star "HR 8762 Aa"
{
	DateUpdated     "2024-06-13"
	ParentBody      "OMI And A"
	Class           "B6IIIpe"
	AbsMagn         -2.6
	MassSol         9.85
	RadSol          6.6
	LumBol          1380
	Teff            13800

	BinaryOrbit // VB6_Zhu2010 BLA_12Aa, Gr.3 ??
	{
		Period          5.6400
		Separation      6.55960387150471 // 0.061 asec
		Eccentricity    0.220
		Inclination     152.0
		AscendingNode   318.0
		Epoch           2452859.405313711613417
		ArgOfPericenter 55.0
		MeanAnomaly     0
	}
}

Star "HR 8762 Ab"
{
	DateUpdated     "2024-06-13"
	ParentBody      "OMI And A"
	Class           ""
	MassSol         4.51
}

Barycenter "OMI And B"
{
	ParentBody      "Gaia DR3 1931192500887330688"
}

Star "HR 8762 Ba"
{
	DateUpdated     "2024-06-13"
	ParentBody      "OMI And B"
	Class           "A2Vp"
	MassSol         3.74

	BinaryOrbit // 1998PASP.100.243  Hill et al.
	{
		PeriodDays      33.0100
		Eccentricity    0.240
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2446925.300
		ArgOfPericenter 226.2
		MeanAnomaly     0
	}
}

Star "HR 8762 Bb"
{
	DateUpdated     "2024-06-13"
	ParentBody      "OMI And B"
	Class           ""
	MassSol         2.86
}

// Object * 2 And A  ---  High Proper Motion Star  ---  OID=@5475423   (@@-1,255)  ---  coobox=10103 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Remove "2 And A" {ParentBody "2 And"}
Remove "2 And B" {ParentBody "2 And"}
Star "2 And A/GJ 9806 A/GJ 886.1 A/WDS J23026+4245A/CCDM J23026+4245A/IDS 22580+4213 A/ADS 16467 A/** BU 1147A/BD+41 4665A/HD 217782A/TYC 3224-3432-1"
{
	DateUpdated     "2024-06-14"
	ParentBody      "HD 217782"
	Class           "A1V"
	AbsMagn         -0.39
	MassSol         2.7
	Radius          3305478.59685983 // 计算的值
	LumBol          130.50
	Teff            8950
	Age             0.100

	BinaryOrbit     
	{
		Period          73.997
		Separation      29.0704354324637 // 0.225 asec
		Eccentricity    0.800
		Inclination     21.7
		AscendingNode   159.5
		Epoch           2404165.315372228622437
		ArgOfPericenter 176.4
		MeanAnomaly     0
	}
}

// Object * 2 And B  ---  High Proper Motion Star  ---  OID=@1586693   (@@33248,15)  ---  coobox=10103 
// Object types: High Proper Motion Star,Variable Star,Double or Multiple Star,Star 
Star "2 And B/GJ 9806 B/GJ 886.1 B/WDS J23026+4245B/ADS 16467 B/BD+41 4665B/CCDM J23026+4245B/CSI+41 4665 4/IDS 22580+4213 B/** BU 1147B/HD 217782B/TYC 3224-3432-2/CSV 103110/NSV 14396"
{
	DateUpdated     "2024-06-14"
	ParentBody      "HD 217782"
	Class           "F1/F4"
	AbsMagn         1.88
	MassSol         1.78
	Radius          1724536.47571306 // log(g) = 3.90 cm/s^2
	LumBol          19.66362765978791 // 计算的值
	Teff            7720
}

// Object * 6 And  ---  High Proper Motion Star  ---  OID=@1586953   (@@33255,3)  ---  coobox=10111 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "6 And A"
{
	DateUpdated     "2024-06-14"
	ParentBody      "6 And"
	Class           "F5V"
	AbsMagn         3.71
	MassSol         1.30
	RadSol          1.50
	LumBol          3.090
	Teff            6425
	FeH             -0.19
	Age             2.91
}

// 伴星质量比太阳稍大一些，但是这会让其非常明显，仅比主星暗大约1等，而缺少紫外线又排除了白矮星的可能，故此处认为是一对轨道周期为1周到1年的红矮星双星
Barycenter "6 And B"
{
	ParentBody      "6 And"
	BinaryOrbit     
	{
		Period          3373
		Epoch           2453116
		ArgOfPericenter 165.2
		MeanAnomaly     0
	}
}

Star "6 And Ba"
{
	DateUpdated     "2024-06-14"
	ParentBody      "6 And B"
	Class           ""
	MassSol         0.51 // 假定质量对半分

	BinaryOrbit     
	{
		PeriodDays      7
	}
}

Star "6 And Bb"
{
	DateUpdated     "2024-06-14"
	ParentBody      "6 And B"
	Class           ""
	MassSol         0.51 // 假定质量对半分
}

// Object * 5 Lac  ---  Red Supergiant  ---  OID=@18498   (@@8078,12)  ---  coobox=525 
// Object types: Red Supergiant,Spectroscopic Binary,Long-Period Variable,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source 
Remove "5 Lac A" {ParentBody "5 Lac"}
Remove "5 Lac B" {ParentBody "5 Lac"}
Star "5 Lac A"
{
	DateUpdated     "2024-06-14"
	ParentBody      "Gaia DR3 1986628812013105152"
	Class           "K9Ia"
	AbsMagn         -4.77 // 计算的值
	MassSol         5.11
	RadSol          359
	LumBol          25100
	Teff            3790
	Age             0.110

	BinaryOrbit     
	{
		Period          41.95
		Eccentricity    0.49
		Epoch           2427578.3
		ArgOfPericenter 143
		MeanAnomaly     0
	}
}

Star "5 Lac B"
{
	DateUpdated     "2024-06-14"
	ParentBody      "Gaia DR3 1986628812013105152"
	Class           "B2V"
}