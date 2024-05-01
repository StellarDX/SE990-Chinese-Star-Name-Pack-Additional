// Object * 30 Dra  ---  Double or Multiple Star  ---  OID=@323096   (@@10721,5)  ---  coobox=1057 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Barycenter "30 Dra A"
{
	ParentBody      "30 Dra"
	BinaryOrbit     
	{
		Period          986577
		Separation      13631.399796378 // 209.73 asec
	}
}

Star "30 Dra Aa"
{
	DateUpdated     "2024-05-01"
	ParentBody      "30 Dra A"
	Class           "A2V"
	AbsMagn         0.936 // 计算的值
	MassKg          3.82335780006952e+30 // log(g) = 3.763 cm/s^2
	RadSol          3.0165 // Gaia DR3
	LumBol          51.3197045263304 // 计算的值
	Teff            8895
	FeH             -0.577

	BinaryOrbit     
	{
		Period          14.413
		Separation      7.93205086556016 // 0.122 asec
	}
}

Star "30 Dra Ab"
{
	ParentBody      "30 Dra A"
	Class           "A8.6?" // DR2-HIP: dmu=(5.42, -9.98) mas/yr, astrometric subsystem!
}

// Object LP 180-33  ---  High Proper Motion Star  ---  OID=@4017376   (@@-1,255)  ---  coobox=1057 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Optical Source 
Star "LP 180-33/Gaia DR3 1367509035768195968/TIC 356227255/NLTT 45544/2MASS J17491810+5044084/USNO-B1.0 1407-00286911/LSPM J1749+5044/SDSS J174918.09+504408.6/** LEP 86B/WDS J17491+5047B/WISEA J174918.05+504410.4/Gaia DR2 1367509035768195968"
{
	ParentBody      "30 Dra"
	Parallax        15.446
	Class           "M3"
	MassSol         0.18
}

// Object * z Her  ---  Be Star  ---  OID=@322827   (@@11104,0)  ---  coobox=1033 
// Object types: Be Star,Be Star,Be Star,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Emission-line Star,Star,UV-emission Source 
Star "88 Her A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "88 Her"
	Class           "B6IIInp_sh"
	AbsMagn         -0.617 // 计算的值
	MassKg          5.93825249231898e+30 // log(g) = 3.714 cm/s^2
	RadSol          3.9775 // Gaia DR3
	LumBol          406.961972798286 // 计算的值
	Teff            12999
	FeH             -1.33

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.644423555
		Eccentricity    0.332452934
		Inclination     0.842576981
		AscendingNode   0
		ArgOfPericenter 166.884267
		MeanAnomaly     -54.886528
	}
}

Star "88 Her B"
{
	ParentBody      "88 Her"
	Class           "A0.7?"
}

// Object * mu. Dra  ---  Double or Multiple Star  ---  OID=@373390   (@@10421,1)  ---  coobox=1086 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=83608
Remove "MU Dra AB"{ParentBody "Arrakis"}
Remove "MU Dra C"{ParentBody "Arrakis"}
Remove "MU Dra A"{ParentBody "MU Dra AB"}
Remove "MU Dra B"{ParentBody "MU Dra AB"}
Remove "MU Dra Ba"{ParentBody "MU Dra B"}
Remove "MU Dra Bb"{ParentBody "MU Dra B"}
Barycenter "HIP 83608 AB"
{
	ParentBody      "HIP 83608"
	BinaryOrbit     
	{
		Period          3479
		Separation      334.320988570105 // 12.186 asec
	}
}

// Object * mu. Dra A  ---  High Proper Motion Star  ---  OID=@373388   (@@10111,15)  ---  coobox=1086 
// Object types: High Proper Motion Star,Double or Multiple Star,Star,UV-emission Source,X-ray Source 
Star "MU Dra A/GJ 9584 A/GJ 9584/Gaia DR3 1420101696287738368/21 Dra A/ADS 10345 A/BD+54 1857A/CCDM J17053+5428A/CSI+54 1857 1/GCRV 9878/HD 154906/HR 6370/IDS 17033+5436 A/RBS 1626/ROT 2414/SKY# 30807/1RXS J170519.9+542809/2EUVE J1705+54.4/EUVE J1705+54.4/RX J1705.3+5428/[ZEH2003] RX J1705.3+5428 1/WDS J17053+5428A/** STF 2130A/** BU 1088A/TYC 3890-1396-2/PMSC 17033+5436A/WEB 14139/Gaia DR2 1420101696287738368"
{
	DateUpdated     "2024-05-01"
	ParentBody      "HIP 83608 AB"
	Parallax        36.7608
	AppMagn         5.66
	Class           "F6V"
	AbsMagn         2.73
	MassSol         1.35
	FeH             -0.01
}

// Object * mu. Dra B  ---  Spectroscopic Binary  ---  OID=@373389   (@@10421,0)  ---  coobox=1086 
// Object types: High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Star,X-ray Source 
Barycenter "MU Dra B/GJ 9584 B/Gaia DR3 1420101696285626624/21 Dra B/ADS 10345 B/BD+54 1857B/CCDM J17053+5428B/CSI+54 1857 2/GCRV 9877/HD 154905/HR 6369/IDS 17033+5436 B/ROT 2413/uvby98 100154905/1E 1704.3+5432/WDS J17053+5428B/** STF 2130B/** BU 1088B/TYC 3890-1396-1/PMSC 17033+5436B/PMSC 17033+5436Bab/GEN# +1.00154905/WEB 14138/Gaia DR2 1420101696285626624/SBC9 947"
{
	ParentBody      "HIP 83608 AB"
	BinaryOrbit // Tok 2020
	{
		Period          728.0000
		Separation      112.565166242565 // 4.103 asec
		Eccentricity    0.473
		Inclination     146.1
		AscendingNode   282.4
		Epoch           2432672.468987085856497
		ArgOfPericenter 195.3
		MeanAnomaly     0
	}
}

Star "MU Dra Ba"
{
	DateUpdated     "2024-05-01"
	ParentBody      "GJ 9584 B"
	Parallax        36.7902
	AppMagn         5.69
	Class           "F6V"
	AbsMagn         3.52 // 计算的值
	MassSol         1.30
	Age             2.2

	BinaryOrbit     
	{
		PeriodDays      2270.0000
		Separation      0.716033199200638 // 0.026 asec
		Eccentricity    0.430
		Inclination     83.5
		AscendingNode   134.1
		Epoch           2442309.000
		ArgOfPericenter 25.0
		MeanAnomaly     0
	}
}

Star "MU Dra Ba"
{
	ParentBody      "GJ 9584 B"
	Class           ""
	MassSol         0.21
}

// Object * mu. Dra C  ---  High Proper Motion Star  ---  OID=@373439   (@@10425,23)  ---  coobox=1086 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "MU Dra C/GJ 9584 C/Gaia DR3 1420101696286312448/TIC 198355684/[RHG95] 2697/ADS 10345 C/BD+54 1837C/CSI+54 1857 4/WDS J17053+5428C/CCDM J17053+5428C/IDS 17033+5436 C/2MASS J17052026+5427597/** BU 1088C/Gaia DR2 1420101696286312448"
{
	DateUpdated     "2024-05-01"
	ParentBody      "HIP 83608"
	Parallax        36.7862
	AppMagn         11.7
	Class           "M3:"
	AbsMagn         9.53 // 计算的值
	MassKg          7.51939722931948e+29 // log(g) = 4.787 cm/s^2
	RadSol          0.4115024 // Gaia DR3
	LumBol          0.0181142568108347 // 计算的值
	Teff            3301
	FeH             -0.008
}

// Object * 26 Dra  ---  Spectroscopic Binary  ---  OID=@340431   (@@9243,6)  ---  coobox=1188 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=86036
Remove "26 Dra (AB)" {ParentBody "26 Dra"}
Remove "26 Dra A" {ParentBody "26 Dra (AB)"}
Remove "26 Dra B" {ParentBody "26 Dra (AB)"}
Remove "26 Dra C" {ParentBody "26 Dra"}
Barycenter "26 Dra AB"
{
	ParentBody      "HIP 86036"
	BinaryOrbit     
	{
		Period          700119
		Separation      10646.1538581591 // 737.600 asec
	}
}

// Object * 26 Dra A  ---  High Proper Motion Star  ---  OID=@340432   (@@9243,7)  ---  coobox=1188 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "26 Dra A/GJ 684 A/ADS 10660 A/BD+61 1678A/CCDM J17351+6152A/CSI+61 1678 2/IDS 17340+6157 A/WDS J17350+6153A/** BU 962A/TYC 4199-1513-1/PMSC 17340+6157A/HD 160269A/UBV 15012"
{
	DateUpdated     "2024-05-01"
	ParentBody      "26 Dra AB"
	Class           "G0IV-V"
	AbsMagn         4.58
	MassSol         1.30
	Radius          738642.10390391 // log(g) = 4.50 cm/s^2
	LumBol          1.3162027450912357 // 计算的值
	Teff            6000
	FeH             -0.18
	Age             8.4 // 11.5

	BinaryOrbit     
	{
		Period          76.1
		Separation      22.0832640264206 // 1.53 asec
		Eccentricity    0.18
		Inclination     104
		AscendingNode   151
		Epoch           2432186.696862706914544
		ArgOfPericenter 127
		MeanAnomaly     0
	}
}

// Object * 26 Dra B  ---  High Proper Motion Star  ---  OID=@340433   (@@9245,0)  ---  coobox=1188 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "26 Dra B/GJ 684 B/ADS 10660 B/BD+61 1678B/CCDM J17351+6152B/CSI+61 1678 3/IDS 17340+6157 B/UBV 21566/WDS J17350+6153B/** BU 962B/TYC 4199-1513-2/PMSC 17340+6157B/HD 160269B"
{
	ParentBody      "26 Dra AB"
	Class           "K3V"
	MassSol         0.83
}

// Object G 226-66  ---  High Proper Motion Star  ---  OID=@338752   (@@9745,0)  ---  coobox=1166 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,UV-emission Source,X-ray Source 
Star "G 226-66/GJ 685/HIP 86087/Gaia DR3 1439069444391326208/StKM 2-1331/MCC 62/TIC 219780306/PLX 4017/LSPM J1735+6140/ASCC 135592/2MASS J17353445+6140540/USNO-B1.0 1516-00240422/AC +62 26749/AC +61 26806/CCDM J17351+6152C/CSI+61-17350/Ci 20 1051/G 227-9/G 240-61/GCRV 67251/GEN# +9.80226066/GEN# +6.10010685/HIC 86087/LFT 1361/LHS 3306/LTT 15224/NLTT 45156/TYC 4199-693-1/UBV M 42971/VVO 223/[RHG95] 2789/vMa 2-13/PLX 4017.00/2EUVE J1735+61.6/EUVE J1735+61.6/ADS 10660 C/GEN# +1.00160269C/WDS J17350+6153C/** LDS 2736C/PMSC 17340+6157P/PMSC 17340+6157C/WISEA J173534.84+614048.3/PM J17355+6140/WEB 14521/Gaia DR2 1439069444391326208/1RXS J173534.3+614050/UCAC4 759-047544/Karmn J17355+616"
{
	DateUpdated     "2024-05-01"
	ParentBody      "HIP 86036"
	Parallax        69.8921
	AppMagn         9.98
	Class           "M1V"
	AbsMagn         9.2 // 计算的值
	MassKg          9.8580817691305e+29 // log(g) = 4.588 cm/s^2
	RadSol          0.5924846 // Gaia DR3
	LumBol          0.0586980930195505 // 计算的值
	Teff            3691
	FeH             -0.408
}

// Object NAME G 226-66b  ---  Extra-solar Planet  ---  OID=@13691180   (@@-1,255)  ---  coobox=1166 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Remove "Gliese 685 b" {ParentBody "Gliese 685"}
Planet	"G 226-66b/GJ 685 b"
{
	ParentBody     "GJ 685"
	DiscMethod     "RadVel"
	DiscDate       "2019"
	Class          "IceGiant"
	Mass           9.0

	Orbit
	{
		PeriodDays      24.160
		SemiMajorAxis   0.1344
		Eccentricity    0
	}
}