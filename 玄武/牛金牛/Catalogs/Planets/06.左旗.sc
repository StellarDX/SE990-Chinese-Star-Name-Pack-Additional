// Object * 2 Sge  ---  Spectroscopic Binary  ---  OID=@2752780   (@@59225,6)  ---  coobox=19704 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=95398
Barycenter "2 Sge A"
{
	ParentBody      "2 Sge"
	BinaryOrbit     
	{
		Period          184.255
		Separation      55.8433144159321 // 0.430 asec
	}
}

Star "2 Sge Aa"
{
	DateUpdated     "2024-06-05"
	ParentBody      "2 Sge A"
	Class           "A2III-IV"
	AbsMagn         0.68 // 计算的值
	MassSol         2.35

	BinaryOrbit     
	{
		PeriodDays      7.3916
		Eccentricity    0.006
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2454408.852
		ArgOfPericenter 158.4
		MeanAnomaly     0
	}
}

Star "2 Sge Ab"
{
	DateUpdated     "2024-06-05"
	ParentBody      "2 Sge A"
	Class           ""
	MassSol         1.75
}

Star "2 Sge B"
{
	DateUpdated     "2024-06-05"
	ParentBody      "2 Sge"
	Class           ""
	MassSol         1.03
}

// Object * 7 Vul  ---  Be Star  ---  OID=@2770288   (@@59196,7)  ---  coobox=19711 
// Object types: Be Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "7 Vul A"
{
	DateUpdated     "2024-06-05"
	ParentBody      "7 Vul"
	Class           "B4IIIe" // B4-5III-IVe
	AbsMagn         -1.66
	MassSol         5.5
	RadSol          5.2
	LumBol          1442.7755002428698 // 计算的值
	Teff            15600
	Age             0.050 // 0.08

	BinaryOrbit     
	{
		PeriodDays      69.30
		Eccentricity    0.161
		Epoch           2454248.1
		ArgOfPericenter 67
		MeanAnomaly     0
	}
}

Star "7 Vul B"
{
	DateUpdated     "2024-06-05"
	ParentBody      "7 Vul"
	Class           "" // K-M? WD?
	MassSol         0.5 // 0.7
}

// Object * 10 Vul  ---  Red Giant Branch star  ---  OID=@2826322   (@@60164,17)  ---  coobox=20248 
// Object types: Red Giant Branch star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "10 Vul A"
{
	DateUpdated     "2024-06-05"
	ParentBody      "10 Vul"
	Class           "G8III"
	AbsMagn         0.47
	MassSol         2.35
	RadSol          13
	LumBol          72
	Teff            5008
	FeH             -0.11
	Age             1.15

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.476402403
		Eccentricity    0
		Inclination     0.269174337
		AscendingNode   0
		ArgOfPericenter -148.696993
		MeanAnomaly     -162.16662
	}
}

Star "10 Vul B"
{
	ParentBody      "10 Vul"
	Class           "F0.2?"
}

// Object * 23 Vul  ---  Double or Multiple Star  ---  OID=@2851646   (@@61237,19)  ---  coobox=20373 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "23 Vul A" {ParentBody "23 Vul"}
Remove "23 Vul B" {ParentBody "23 Vul"}
Barycenter "23 Vul A"
{
	ParentBody      "HIP 99874"
	BinaryOrbit     
	{
		Separation      26.0934916071184 // 0.26 asec
	}
}

Star "23 Vul Aa"
{
	DateUpdated     "2024-06-05"
	ParentBody      "23 Vul A"
	Class           "K3IIIFe-1"
	AbsMagn         -0.58
	MassSol         2.4
	Radius          14277107.5650262 // 计算的值
	LumBol          146
	Teff            4429
	FeH             0.03

	BinaryOrbit     
	{
		Period          25.33
		Separation      11.1414675496979 // 0.111 asec
		Eccentricity    0.400
		Inclination     71.5
		AscendingNode   97.5
		Epoch           2455036.248818446416408
		ArgOfPericenter 113.8
		MeanAnomaly     0
	}
}

Star "23 Vul Ab"
{
	ParentBody      "23 Vul A"
	Class           "A6.5?"
}

Star "23 Vul B"
{
	ParentBody      "HIP 99874"
	Class           "B9.9?"
}

// Object * 18 Vul  ---  Spectroscopic Binary  ---  OID=@2851474   (@@61255,23)  ---  coobox=20286 
// Object types: Spectroscopic Binary,delta Sct Variable,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source 
Star "18 Vul A"
{
	DateUpdated     "2024-06-05"
	ParentBody      "18 Vul"
	Class           "A3III"
	AbsMagn         -0.05
	MassSol         2.4
	RadSol          3.5
	LumBol          52.37718292785523 // 计算的值
	Teff            8300

	BinaryOrbit     
	{
		PeriodDays      9.314077
		Separation      0.14742
		Eccentricity    0.0116
		Epoch           2454875.09
		ArgOfPericenter 139.4
		MeanAnomaly     0
	}
}

Star "18 Vul B"
{
	DateUpdated     "2024-06-05"
	ParentBody      "18 Vul"
	Class           ""
	MassSol         2.2
	RadSol          2.4
}

// Object * 16 Vul A  ---  High Proper Motion Star  ---  OID=@13281333   (@@-1,255)  ---  coobox=20274
// Object types: High Proper Motion Star,Double or Multiple Star,Star
Star "16 Vul A/TYC 2145-1661-1/CCDM J20020+2456A/** STT 395A/WDS J20020+2456A/HD 190004A"
{
	DateUpdated     "2024-06-05"
	ParentBody      "16 Vul"
	Class           "F2III"
	AbsMagn         2.47
	MassSol         1.34
	Radius          2725702.46967413 // 计算的值
	LumBol          31.13
	Teff            6888
	FeH             0.17
	Age             0.742
	Oblateness      0.1735537190082644628099173553719 // Vsini = 136.1 Km/s

	BinaryOrbit     
	{
		Period          1201
		Separation      182.664821407326 // 2.687 asec
		Eccentricity    0.932
		Inclination     79.0
		AscendingNode   84.5
		Epoch           2401762.021704249549657
		ArgOfPericenter 96.5
		MeanAnomaly     0
	}
}

// Object * 16 Vul B  ---  High Proper Motion Star  ---  OID=@7966406   (@@-1,255)  ---  coobox=20274
// Object types: High Proper Motion Star,Double or Multiple Star,Star
Star "16 Vul B/TYC 2145-1661-2/CCDM J20020+2456B/** STT 395B/WDS J20020+2456B/HD 190004B"
{
	ParentBody      "16 Vul"
	Class           "F2.8?"
}

// Object * 13 Vul  ---  Pulsating Variable  ---  OID=@2807987   (@@60175,0)  ---  coobox=20261 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "13 Vul A"
{
	DateUpdated     "2024-06-05"
	ParentBody      "13 Vul"
	Class           "B9.5III"
	AbsMagn         -0.48
	RadSol          1.3
	LumBol          180
	Teff            8801
	FeH             -0.11

	BinaryOrbit     
	{
		Period          615.25
		Separation      161.404387519201
		Eccentricity    0.079
		Inclination     85.9
		AscendingNode   68.1
		Epoch           2461705.571368187200278
		ArgOfPericenter 349.7
		MeanAnomaly     0
	}
}

// Object * 13 Vul B  ---  Star  ---  OID=@8605379   (@@-1,255)  ---  coobox=20261
// Object types: Double or Multiple Star,Star
Star "13 Vul B/TYC 2140-3051-2/CCDM J19535+2405B/** DJU 4B/HD 188260B/BD+23 3820B/WDS J19535+2405B/Gaia DR2 1828386961103698560"
{
	ParentBody      "13 Vul"
	Class           "B9.9?"
}

// Object * 22 Vul  ---  Spectroscopic Binary  ---  OID=@2809424   (@@61294,0)  ---  coobox=20357 
// Object types: Near-IR Source (λ < 3 µm),Eclipsing Binary,Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "22 Vul A"
{
	DateUpdated     "2024-06-06"
	ParentBody      "22 Vul"
	Class           "G3Ib-II"
	AbsMagn         -3.5
	MassSol         4.649
	RadSol          96
	LumBol          2188
	Teff            4699
	RotationPeriod  3408 // 3960

	BinaryOrbit     
	{
		PeriodDays      249.18
		Eccentricity    0.011
		Inclination     81.34
		ArgOfPericenter 180 // assumed
		MeanAnomaly     0
	}
}

Star "22 Vul B"
{
	DateUpdated     "2024-06-06"
	ParentBody      "22 Vul"
	Class           "B8V"
	AbsMagn         -0.1
	MassSol         3.150
	RadSol          3.4
	LumBol          123
	Teff            11995
	Age             0.1351
}

// Object * tet Sge A  ---  High Proper Motion Star  ---  OID=@2791706   (@@61300,12)  ---  coobox=20267 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "TET Sge A/HIP 99352/Gaia DR3 1829590548393010560/TIC 395371486/PLX 4785/ADS 13442 A/AG+20 2208/BD+20 4453/CCDM J20099+2054A/CSI+20 4453 2/GC 27987/GCRV 12520/GEN# +1.00191570A/GSC 01630-00481/HD 191570/HIC 99352/HR 7705/PPM 110544/SAO 88276/SKY# 37945/TD1 26163/TYC 1630-481-1/UBV 17370/UBV M 24551/UBV M 24563/YZ 20 7516/uvby98 100191570 A/2MASS J20095665+2054541/WDS J20099+2055A/Gaia DR1 1829590544090734848/WEB 17727/Gaia DR2 1829590548393010560/17 Sge A"
{
	DateUpdated     "2024-06-06"
	ParentBody      "TET Sge"
	Class           "F3V"
	AbsMagn         3.24
	MassSol         1.52
	RadSol          1.45
	LumBol          4.0
	Teff            6750
	FeH             -0.17
	Age             2.089

	BinaryOrbit     
	{
		Epoch           2455563
		Separation      502
		PositionAngle   331.1
	}
}

// Object * tet Sge B  ---  High Proper Motion Star  ---  OID=@2791705   (@@61300,11)  ---  coobox=20267 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "TET Sge B/HIP 99351/Gaia DR3 1829590548393015168/TIC 395371499/ADS 13442 B/AG+20 2207/CCDM J20099+2054B/CSI+20 4453 1/GC 27986/GCRV 12519/GEN# +1.00191570B/GSC 01630-03826/HIC 99351/PPM 110543/SAO 88275/TYC 1630-3826-1/UBV 17371/2MASS J20095624+2055043/WDS J20099+2055B/** STF 2637B/Gaia DR1 1829590544080816768/WEB 17729/Gaia DR2 1829590548393015168/17 Sge B"
{
	DateUpdated     "2024-06-06"
	ParentBody      "TET Sge"
	Parallax        22.4201
	AppMagn         8.769
	Class           "G5V"
	AbsMagn         5.58
	MassSol         0.95
	RadSol          0.82
	LumBol          0.516
	Teff            5394
}

// Object * 15 Sge  ---  High Proper Motion Star  ---  OID=@2774200   (@@60815,12)  ---  coobox=20092 
// Object types: Rotating Variable,High Proper Motion Star,Variable Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "15 Sge A" {ParentBody "15 Sge"}
Remove "HD 190406 B" {ParentBody "15 Sge"}
Star "15 sge A"
{
	DateUpdated     "2024-06-06"
	ParentBody      "15 Sge"
	Class           "G0V"
	AbsMagn         4.55
	MassSol         1.08
	RadSol          1.115
	LumBol          1.338
	Teff            5883
	FeH             0.05
	RotationPeriod  420
	Age             2.5
}

// Object * 15 Sge B  ---  Brown Dwarf  ---  OID=@7835177   (@@-1,255)  ---  coobox=20092 
// Object types: Brown Dwarf,Double or Multiple Star,Star 
Star "15 Sge B/GJ 779 B/HR 7672B/WDS J20041+1704Ab"
{
	DateUpdated     "2024-06-06"
	ParentBody      "15 Sge A"
	Class           "L4-5"
	MassJup         68.7
	Radius          71492
	LumBol          0.000075
	Teff            1510 // 1850

	Orbit     
	{
		Period          73.3
		SemiMajorAxis   18.3
		Eccentricity    0.50
		Inclination     97.3
	}
}

// Object * 10 Sge  ---  Classical Cepheid Variable  ---  OID=@2755366   (@@60823,0)  ---  coobox=20081 
// Object types: RV Tauri Variable,Classical Cepheid Variable,Classical Cepheid Variable,Classical Cepheid Variable,Classical Cepheid Variable,Variable Star,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "10 Sge A"
{
	DateUpdated     "2024-06-06"
	ParentBody      "10 Sge"
	Class           "F7Ib"
	AbsMagn         -3.8
	MassSol         7
	RadSol          58.5
	LumBol          5200
	Teff            5400
	FeH             0.1
	Age             0.081
}

Barycenter "10 Sge B"
{
	ParentBody      "10 Sge"
	BinaryOrbit     
	{
		PeriodDays      676
	}
}

Star "10 Sge Ba"
{
	DateUpdated     "2024-06-06"
	ParentBody      "10 Sge B"
	Class           "A7V" // F0V
	MassSol         1.7 // 1.5

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.143225624
		Eccentricity    0.647690212
		Inclination     1.70196146
		AscendingNode   0
		ArgOfPericenter -78.8953689
		MeanAnomaly     142.803452
	}
}

Star "10 Sge Bb"
{
	DateUpdated     "2024-06-06"
	ParentBody      "10 Sge B"
	Class           ""
	MassSol         1.1 // 总质量2.8
}

// Object * 9 Sge  ---  Blue Supergiant  ---  OID=@2772691   (@@60262,0)  ---  coobox=20062 
// Object types: Blue Supergiant,Spectroscopic Binary,Blue Supergiant,Spectroscopic Binary,Spectroscopic Binary,Eclipsing Binary,Variable Star,Emission-line Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source,X-ray Source 
Star "9 Sge A"
{
	DateUpdated     "2024-06-06"
	ParentBody      "9 Sge"
	Class           "O7.5Iabf"
	AbsMagn         -5.2 // 计算的值

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.200056254
		Eccentricity    0
		Inclination     1.32289398
		AscendingNode   0
		ArgOfPericenter -47.843065
		MeanAnomaly     -164.840187
	}
}

Star "9 Sge B"
{
	ParentBody      "9 Sge"
	Class           "O8.9?"
}